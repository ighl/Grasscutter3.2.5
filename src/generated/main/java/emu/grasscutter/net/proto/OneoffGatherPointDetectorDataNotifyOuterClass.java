// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collections;
import com.google.protobuf.Parser;
import java.util.List;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class OneoffGatherPointDetectorDataNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_OneoffGatherPointDetectorDataNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_OneoffGatherPointDetectorDataNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private OneoffGatherPointDetectorDataNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return OneoffGatherPointDetectorDataNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n)OneoffGatherPointDetectorDataNotify.proto\u001a#OneoffGatherPointDetectorData.proto\"\u00c4\u0001\n#OneoffGatherPointDetectorDataNotify\u0012N\n&oneoff_gather_point_detector_data_list\u0018\u0006 \u0003(\u000b2\u001e.OneoffGatherPointDetectorData\"M\n\u0005CmdId\u0012\b\n\u0004NONE\u0010\u0000\u0012\u0013\n\u000fENET_CHANNEL_ID\u0010\u0000\u0012\u0014\n\u0010ENET_IS_RELIABLE\u0010\u0001\u0012\u000b\n\u0006CMD_ID\u0010¦!\u001a\u0002\u0010\u0001B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        OneoffGatherPointDetectorDataNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { OneoffGatherPointDetectorDataOuterClass.getDescriptor() });
        internal_static_OneoffGatherPointDetectorDataNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_OneoffGatherPointDetectorDataNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(OneoffGatherPointDetectorDataNotifyOuterClass.internal_static_OneoffGatherPointDetectorDataNotify_descriptor, new String[] { "OneoffGatherPointDetectorDataList" });
        OneoffGatherPointDetectorDataOuterClass.getDescriptor();
    }
    
    public static final class OneoffGatherPointDetectorDataNotify extends GeneratedMessageV3 implements OneoffGatherPointDetectorDataNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ONEOFF_GATHER_POINT_DETECTOR_DATA_LIST_FIELD_NUMBER = 6;
        private List<OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData> oneoffGatherPointDetectorDataList_;
        private byte memoizedIsInitialized;
        private static final OneoffGatherPointDetectorDataNotify DEFAULT_INSTANCE;
        private static final Parser<OneoffGatherPointDetectorDataNotify> PARSER;
        
        private OneoffGatherPointDetectorDataNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private OneoffGatherPointDetectorDataNotify() {
            this.memoizedIsInitialized = -1;
            this.oneoffGatherPointDetectorDataList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new OneoffGatherPointDetectorDataNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private OneoffGatherPointDetectorDataNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            int mutable_bitField0_ = 0;
            final UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    final int tag = input.readTag();
                    switch (tag) {
                        case 0: {
                            done = true;
                            continue;
                        }
                        case 50: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.oneoffGatherPointDetectorDataList_ = new ArrayList<OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.oneoffGatherPointDetectorDataList_.add(input.readMessage(OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData.parser(), extensionRegistry));
                            continue;
                        }
                        default: {
                            if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                                continue;
                            }
                            continue;
                        }
                    }
                }
            }
            catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            }
            catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
            }
            finally {
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.oneoffGatherPointDetectorDataList_ = Collections.unmodifiableList((List<? extends OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData>)this.oneoffGatherPointDetectorDataList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return OneoffGatherPointDetectorDataNotifyOuterClass.internal_static_OneoffGatherPointDetectorDataNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return OneoffGatherPointDetectorDataNotifyOuterClass.internal_static_OneoffGatherPointDetectorDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(OneoffGatherPointDetectorDataNotify.class, Builder.class);
        }
        
        @Override
        public List<OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData> getOneoffGatherPointDetectorDataListList() {
            return this.oneoffGatherPointDetectorDataList_;
        }
        
        @Override
        public List<? extends OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorDataOrBuilder> getOneoffGatherPointDetectorDataListOrBuilderList() {
            return this.oneoffGatherPointDetectorDataList_;
        }
        
        @Override
        public int getOneoffGatherPointDetectorDataListCount() {
            return this.oneoffGatherPointDetectorDataList_.size();
        }
        
        @Override
        public OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData getOneoffGatherPointDetectorDataList(final int index) {
            return this.oneoffGatherPointDetectorDataList_.get(index);
        }
        
        @Override
        public OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorDataOrBuilder getOneoffGatherPointDetectorDataListOrBuilder(final int index) {
            return this.oneoffGatherPointDetectorDataList_.get(index);
        }
        
        @Override
        public final boolean isInitialized() {
            final byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }
        
        @Override
        public void writeTo(final CodedOutputStream output) throws IOException {
            for (int i = 0; i < this.oneoffGatherPointDetectorDataList_.size(); ++i) {
                output.writeMessage(6, this.oneoffGatherPointDetectorDataList_.get(i));
            }
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            for (int i = 0; i < this.oneoffGatherPointDetectorDataList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(6, this.oneoffGatherPointDetectorDataList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OneoffGatherPointDetectorDataNotify)) {
                return super.equals(obj);
            }
            final OneoffGatherPointDetectorDataNotify other = (OneoffGatherPointDetectorDataNotify)obj;
            return this.getOneoffGatherPointDetectorDataListList().equals(other.getOneoffGatherPointDetectorDataListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getOneoffGatherPointDetectorDataListCount() > 0) {
                hash = 37 * hash + 6;
                hash = 53 * hash + this.getOneoffGatherPointDetectorDataListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static OneoffGatherPointDetectorDataNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return OneoffGatherPointDetectorDataNotify.PARSER.parseFrom(data);
        }
        
        public static OneoffGatherPointDetectorDataNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return OneoffGatherPointDetectorDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static OneoffGatherPointDetectorDataNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return OneoffGatherPointDetectorDataNotify.PARSER.parseFrom(data);
        }
        
        public static OneoffGatherPointDetectorDataNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return OneoffGatherPointDetectorDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static OneoffGatherPointDetectorDataNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return OneoffGatherPointDetectorDataNotify.PARSER.parseFrom(data);
        }
        
        public static OneoffGatherPointDetectorDataNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return OneoffGatherPointDetectorDataNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static OneoffGatherPointDetectorDataNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(OneoffGatherPointDetectorDataNotify.PARSER, input);
        }
        
        public static OneoffGatherPointDetectorDataNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(OneoffGatherPointDetectorDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static OneoffGatherPointDetectorDataNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(OneoffGatherPointDetectorDataNotify.PARSER, input);
        }
        
        public static OneoffGatherPointDetectorDataNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(OneoffGatherPointDetectorDataNotify.PARSER, input, extensionRegistry);
        }
        
        public static OneoffGatherPointDetectorDataNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(OneoffGatherPointDetectorDataNotify.PARSER, input);
        }
        
        public static OneoffGatherPointDetectorDataNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(OneoffGatherPointDetectorDataNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return OneoffGatherPointDetectorDataNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final OneoffGatherPointDetectorDataNotify prototype) {
            return OneoffGatherPointDetectorDataNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == OneoffGatherPointDetectorDataNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static OneoffGatherPointDetectorDataNotify getDefaultInstance() {
            return OneoffGatherPointDetectorDataNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<OneoffGatherPointDetectorDataNotify> parser() {
            return OneoffGatherPointDetectorDataNotify.PARSER;
        }
        
        @Override
        public Parser<OneoffGatherPointDetectorDataNotify> getParserForType() {
            return OneoffGatherPointDetectorDataNotify.PARSER;
        }
        
        @Override
        public OneoffGatherPointDetectorDataNotify getDefaultInstanceForType() {
            return OneoffGatherPointDetectorDataNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new OneoffGatherPointDetectorDataNotify();
            PARSER = new AbstractParser<OneoffGatherPointDetectorDataNotify>() {
                @Override
                public OneoffGatherPointDetectorDataNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new OneoffGatherPointDetectorDataNotify(input, extensionRegistry);
                }
            };
        }
        
        public enum CmdId implements ProtocolMessageEnum
        {
            NONE(0, 0), 
            ENET_IS_RELIABLE(2, 1), 
            CMD_ID(3, 4262), 
            UNRECOGNIZED(-1, -1);
            
            public static final CmdId ENET_CHANNEL_ID;
            public static final int NONE_VALUE = 0;
            public static final int ENET_CHANNEL_ID_VALUE = 0;
            public static final int ENET_IS_RELIABLE_VALUE = 1;
            public static final int CMD_ID_VALUE = 4262;
            private static final Internal.EnumLiteMap<CmdId> internalValueMap;
            private static final CmdId[] VALUES;
            private final int index;
            private final int value;
            
            @Override
            public final int getNumber() {
                if (this.index == -1) {
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                }
                return this.value;
            }
            
            @Deprecated
            public static CmdId valueOf(final int value) {
                return forNumber(value);
            }
            
            public static CmdId forNumber(final int value) {
                switch (value) {
                    case 0: {
                        return CmdId.NONE;
                    }
                    case 1: {
                        return CmdId.ENET_IS_RELIABLE;
                    }
                    case 4262: {
                        return CmdId.CMD_ID;
                    }
                    default: {
                        return null;
                    }
                }
            }
            
            public static Internal.EnumLiteMap<CmdId> internalGetValueMap() {
                return CmdId.internalValueMap;
            }
            
            @Override
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                if (this.index == -1) {
                    throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
                }
                return getDescriptor().getValues().get(this.index);
            }
            
            @Override
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }
            
            public static final Descriptors.EnumDescriptor getDescriptor() {
                return OneoffGatherPointDetectorDataNotify.getDescriptor().getEnumTypes().get(0);
            }
            
            private static CmdId[] getStaticValuesArray() {
                return new CmdId[] { CmdId.NONE, CmdId.ENET_CHANNEL_ID, CmdId.ENET_IS_RELIABLE, CmdId.CMD_ID };
            }
            
            public static CmdId valueOf(final Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                }
                if (desc.getIndex() == -1) {
                    return CmdId.UNRECOGNIZED;
                }
                return CmdId.VALUES[desc.getIndex()];
            }
            
            private CmdId(final int index, final int value) {
                this.index = index;
                this.value = value;
            }
            
            private static /* synthetic */ CmdId[] value() {
                return new CmdId[] { CmdId.NONE, CmdId.ENET_IS_RELIABLE, CmdId.CMD_ID, CmdId.UNRECOGNIZED };
            }
            
            static {
                VALUES = values();
                ENET_CHANNEL_ID = CmdId.NONE;
                internalValueMap = new Internal.EnumLiteMap<CmdId>() {
                    @Override
                    public CmdId findValueByNumber(final int number) {
                        return CmdId.forNumber(number);
                    }
                };
            }
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements OneoffGatherPointDetectorDataNotifyOrBuilder
        {
            private int bitField0_;
            private List<OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData> oneoffGatherPointDetectorDataList_;
            private RepeatedFieldBuilderV3<OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData, OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData.Builder, OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorDataOrBuilder> oneoffGatherPointDetectorDataListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return OneoffGatherPointDetectorDataNotifyOuterClass.internal_static_OneoffGatherPointDetectorDataNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return OneoffGatherPointDetectorDataNotifyOuterClass.internal_static_OneoffGatherPointDetectorDataNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(OneoffGatherPointDetectorDataNotify.class, Builder.class);
            }
            
            private Builder() {
                this.oneoffGatherPointDetectorDataList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.oneoffGatherPointDetectorDataList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (OneoffGatherPointDetectorDataNotify.alwaysUseFieldBuilders) {
                    this.getOneoffGatherPointDetectorDataListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.oneoffGatherPointDetectorDataListBuilder_ == null) {
                    this.oneoffGatherPointDetectorDataList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.oneoffGatherPointDetectorDataListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return OneoffGatherPointDetectorDataNotifyOuterClass.internal_static_OneoffGatherPointDetectorDataNotify_descriptor;
            }
            
            @Override
            public OneoffGatherPointDetectorDataNotify getDefaultInstanceForType() {
                return OneoffGatherPointDetectorDataNotify.getDefaultInstance();
            }
            
            @Override
            public OneoffGatherPointDetectorDataNotify build() {
                final OneoffGatherPointDetectorDataNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public OneoffGatherPointDetectorDataNotify buildPartial() {
                final OneoffGatherPointDetectorDataNotify result = new OneoffGatherPointDetectorDataNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.oneoffGatherPointDetectorDataListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.oneoffGatherPointDetectorDataList_ = Collections.unmodifiableList((List<? extends OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData>)this.oneoffGatherPointDetectorDataList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.oneoffGatherPointDetectorDataList_ = this.oneoffGatherPointDetectorDataList_;
                }
                else {
                    result.oneoffGatherPointDetectorDataList_ = this.oneoffGatherPointDetectorDataListBuilder_.build();
                }
                this.onBuilt();
                return result;
            }
            
            @Override
            public Builder clone() {
                return super.clone();
            }
            
            @Override
            public Builder setField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.setField(field, value);
            }
            
            @Override
            public Builder clearField(final Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            
            @Override
            public Builder clearOneof(final Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            
            @Override
            public Builder setRepeatedField(final Descriptors.FieldDescriptor field, final int index, final Object value) {
                return super.setRepeatedField(field, index, value);
            }
            
            @Override
            public Builder addRepeatedField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.addRepeatedField(field, value);
            }
            
            @Override
            public Builder mergeFrom(final Message other) {
                if (other instanceof OneoffGatherPointDetectorDataNotify) {
                    return this.mergeFrom((OneoffGatherPointDetectorDataNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final OneoffGatherPointDetectorDataNotify other) {
                if (other == OneoffGatherPointDetectorDataNotify.getDefaultInstance()) {
                    return this;
                }
                if (this.oneoffGatherPointDetectorDataListBuilder_ == null) {
                    if (!other.oneoffGatherPointDetectorDataList_.isEmpty()) {
                        if (this.oneoffGatherPointDetectorDataList_.isEmpty()) {
                            this.oneoffGatherPointDetectorDataList_ = other.oneoffGatherPointDetectorDataList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureOneoffGatherPointDetectorDataListIsMutable();
                            this.oneoffGatherPointDetectorDataList_.addAll(other.oneoffGatherPointDetectorDataList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.oneoffGatherPointDetectorDataList_.isEmpty()) {
                    if (this.oneoffGatherPointDetectorDataListBuilder_.isEmpty()) {
                        this.oneoffGatherPointDetectorDataListBuilder_.dispose();
                        this.oneoffGatherPointDetectorDataListBuilder_ = null;
                        this.oneoffGatherPointDetectorDataList_ = other.oneoffGatherPointDetectorDataList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.oneoffGatherPointDetectorDataListBuilder_ = (OneoffGatherPointDetectorDataNotify.alwaysUseFieldBuilders ? this.getOneoffGatherPointDetectorDataListFieldBuilder() : null);
                    }
                    else {
                        this.oneoffGatherPointDetectorDataListBuilder_.addAllMessages(other.oneoffGatherPointDetectorDataList_);
                    }
                }
                this.mergeUnknownFields(other.unknownFields);
                this.onChanged();
                return this;
            }
            
            @Override
            public final boolean isInitialized() {
                return true;
            }
            
            @Override
            public Builder mergeFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                OneoffGatherPointDetectorDataNotify parsedMessage = null;
                try {
                    parsedMessage = OneoffGatherPointDetectorDataNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (OneoffGatherPointDetectorDataNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureOneoffGatherPointDetectorDataListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.oneoffGatherPointDetectorDataList_ = new ArrayList<OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData>(this.oneoffGatherPointDetectorDataList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData> getOneoffGatherPointDetectorDataListList() {
                if (this.oneoffGatherPointDetectorDataListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData>)this.oneoffGatherPointDetectorDataList_);
                }
                return this.oneoffGatherPointDetectorDataListBuilder_.getMessageList();
            }
            
            @Override
            public int getOneoffGatherPointDetectorDataListCount() {
                if (this.oneoffGatherPointDetectorDataListBuilder_ == null) {
                    return this.oneoffGatherPointDetectorDataList_.size();
                }
                return this.oneoffGatherPointDetectorDataListBuilder_.getCount();
            }
            
            @Override
            public OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData getOneoffGatherPointDetectorDataList(final int index) {
                if (this.oneoffGatherPointDetectorDataListBuilder_ == null) {
                    return this.oneoffGatherPointDetectorDataList_.get(index);
                }
                return this.oneoffGatherPointDetectorDataListBuilder_.getMessage(index);
            }
            
            public Builder setOneoffGatherPointDetectorDataList(final int index, final OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData value) {
                if (this.oneoffGatherPointDetectorDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureOneoffGatherPointDetectorDataListIsMutable();
                    this.oneoffGatherPointDetectorDataList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.oneoffGatherPointDetectorDataListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setOneoffGatherPointDetectorDataList(final int index, final OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData.Builder builderForValue) {
                if (this.oneoffGatherPointDetectorDataListBuilder_ == null) {
                    this.ensureOneoffGatherPointDetectorDataListIsMutable();
                    this.oneoffGatherPointDetectorDataList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.oneoffGatherPointDetectorDataListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addOneoffGatherPointDetectorDataList(final OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData value) {
                if (this.oneoffGatherPointDetectorDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureOneoffGatherPointDetectorDataListIsMutable();
                    this.oneoffGatherPointDetectorDataList_.add(value);
                    this.onChanged();
                }
                else {
                    this.oneoffGatherPointDetectorDataListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addOneoffGatherPointDetectorDataList(final int index, final OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData value) {
                if (this.oneoffGatherPointDetectorDataListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureOneoffGatherPointDetectorDataListIsMutable();
                    this.oneoffGatherPointDetectorDataList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.oneoffGatherPointDetectorDataListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addOneoffGatherPointDetectorDataList(final OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData.Builder builderForValue) {
                if (this.oneoffGatherPointDetectorDataListBuilder_ == null) {
                    this.ensureOneoffGatherPointDetectorDataListIsMutable();
                    this.oneoffGatherPointDetectorDataList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.oneoffGatherPointDetectorDataListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addOneoffGatherPointDetectorDataList(final int index, final OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData.Builder builderForValue) {
                if (this.oneoffGatherPointDetectorDataListBuilder_ == null) {
                    this.ensureOneoffGatherPointDetectorDataListIsMutable();
                    this.oneoffGatherPointDetectorDataList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.oneoffGatherPointDetectorDataListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllOneoffGatherPointDetectorDataList(final Iterable<? extends OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData> values) {
                if (this.oneoffGatherPointDetectorDataListBuilder_ == null) {
                    this.ensureOneoffGatherPointDetectorDataListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.oneoffGatherPointDetectorDataList_);
                    this.onChanged();
                }
                else {
                    this.oneoffGatherPointDetectorDataListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearOneoffGatherPointDetectorDataList() {
                if (this.oneoffGatherPointDetectorDataListBuilder_ == null) {
                    this.oneoffGatherPointDetectorDataList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.oneoffGatherPointDetectorDataListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeOneoffGatherPointDetectorDataList(final int index) {
                if (this.oneoffGatherPointDetectorDataListBuilder_ == null) {
                    this.ensureOneoffGatherPointDetectorDataListIsMutable();
                    this.oneoffGatherPointDetectorDataList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.oneoffGatherPointDetectorDataListBuilder_.remove(index);
                }
                return this;
            }
            
            public OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData.Builder getOneoffGatherPointDetectorDataListBuilder(final int index) {
                return this.getOneoffGatherPointDetectorDataListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorDataOrBuilder getOneoffGatherPointDetectorDataListOrBuilder(final int index) {
                if (this.oneoffGatherPointDetectorDataListBuilder_ == null) {
                    return this.oneoffGatherPointDetectorDataList_.get(index);
                }
                return this.oneoffGatherPointDetectorDataListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorDataOrBuilder> getOneoffGatherPointDetectorDataListOrBuilderList() {
                if (this.oneoffGatherPointDetectorDataListBuilder_ != null) {
                    return this.oneoffGatherPointDetectorDataListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorDataOrBuilder>)this.oneoffGatherPointDetectorDataList_);
            }
            
            public OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData.Builder addOneoffGatherPointDetectorDataListBuilder() {
                return this.getOneoffGatherPointDetectorDataListFieldBuilder().addBuilder(OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData.getDefaultInstance());
            }
            
            public OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData.Builder addOneoffGatherPointDetectorDataListBuilder(final int index) {
                return this.getOneoffGatherPointDetectorDataListFieldBuilder().addBuilder(index, OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData.getDefaultInstance());
            }
            
            public List<OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData.Builder> getOneoffGatherPointDetectorDataListBuilderList() {
                return this.getOneoffGatherPointDetectorDataListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData, OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData.Builder, OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorDataOrBuilder> getOneoffGatherPointDetectorDataListFieldBuilder() {
                if (this.oneoffGatherPointDetectorDataListBuilder_ == null) {
                    this.oneoffGatherPointDetectorDataListBuilder_ = new RepeatedFieldBuilderV3<OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData, OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData.Builder, OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorDataOrBuilder>(this.oneoffGatherPointDetectorDataList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.oneoffGatherPointDetectorDataList_ = null;
                }
                return this.oneoffGatherPointDetectorDataListBuilder_;
            }
            
            @Override
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface OneoffGatherPointDetectorDataNotifyOrBuilder extends MessageOrBuilder
    {
        List<OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData> getOneoffGatherPointDetectorDataListList();
        
        OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorData getOneoffGatherPointDetectorDataList(final int p0);
        
        int getOneoffGatherPointDetectorDataListCount();
        
        List<? extends OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorDataOrBuilder> getOneoffGatherPointDetectorDataListOrBuilderList();
        
        OneoffGatherPointDetectorDataOuterClass.OneoffGatherPointDetectorDataOrBuilder getOneoffGatherPointDetectorDataListOrBuilder(final int p0);
    }
}
