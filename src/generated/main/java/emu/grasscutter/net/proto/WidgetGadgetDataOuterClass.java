// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collections;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.util.List;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.Internal;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class WidgetGadgetDataOuterClass
{
    private static final Descriptors.Descriptor internal_static_WidgetGadgetData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WidgetGadgetData_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private WidgetGadgetDataOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return WidgetGadgetDataOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016WidgetGadgetData.proto\"D\n\u0010WidgetGadgetData\u0012\u001d\n\u0015gadget_entity_id_list\u0018\u0001 \u0003(\r\u0012\u0011\n\tgadget_id\u0018\b \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        WidgetGadgetDataOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_WidgetGadgetData_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_WidgetGadgetData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(WidgetGadgetDataOuterClass.internal_static_WidgetGadgetData_descriptor, new String[] { "GadgetEntityIdList", "GadgetId" });
    }
    
    public static final class WidgetGadgetData extends GeneratedMessageV3 implements WidgetGadgetDataOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int GADGET_ENTITY_ID_LIST_FIELD_NUMBER = 1;
        private Internal.IntList gadgetEntityIdList_;
        private int gadgetEntityIdListMemoizedSerializedSize;
        public static final int GADGET_ID_FIELD_NUMBER = 8;
        private int gadgetId_;
        private byte memoizedIsInitialized;
        private static final WidgetGadgetData DEFAULT_INSTANCE;
        private static final Parser<WidgetGadgetData> PARSER;
        
        private WidgetGadgetData(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.gadgetEntityIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private WidgetGadgetData() {
            this.gadgetEntityIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.gadgetEntityIdList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new WidgetGadgetData();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private WidgetGadgetData(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 8: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.gadgetEntityIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.gadgetEntityIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 10: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.gadgetEntityIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.gadgetEntityIdList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 64: {
                            this.gadgetId_ = input.readUInt32();
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
                    this.gadgetEntityIdList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return WidgetGadgetDataOuterClass.internal_static_WidgetGadgetData_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return WidgetGadgetDataOuterClass.internal_static_WidgetGadgetData_fieldAccessorTable.ensureFieldAccessorsInitialized(WidgetGadgetData.class, Builder.class);
        }
        
        @Override
        public List<Integer> getGadgetEntityIdListList() {
            return this.gadgetEntityIdList_;
        }
        
        @Override
        public int getGadgetEntityIdListCount() {
            return this.gadgetEntityIdList_.size();
        }
        
        @Override
        public int getGadgetEntityIdList(final int index) {
            return this.gadgetEntityIdList_.getInt(index);
        }
        
        @Override
        public int getGadgetId() {
            return this.gadgetId_;
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
            this.getSerializedSize();
            if (this.getGadgetEntityIdListList().size() > 0) {
                output.writeUInt32NoTag(10);
                output.writeUInt32NoTag(this.gadgetEntityIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.gadgetEntityIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.gadgetEntityIdList_.getInt(i));
            }
            if (this.gadgetId_ != 0) {
                output.writeUInt32(8, this.gadgetId_);
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
            int dataSize = 0;
            for (int i = 0; i < this.gadgetEntityIdList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.gadgetEntityIdList_.getInt(i));
            }
            size += dataSize;
            if (!this.getGadgetEntityIdListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.gadgetEntityIdListMemoizedSerializedSize = dataSize;
            if (this.gadgetId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.gadgetId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WidgetGadgetData)) {
                return super.equals(obj);
            }
            final WidgetGadgetData other = (WidgetGadgetData)obj;
            return this.getGadgetEntityIdListList().equals(other.getGadgetEntityIdListList()) && this.getGadgetId() == other.getGadgetId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getGadgetEntityIdListCount() > 0) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getGadgetEntityIdListList().hashCode();
            }
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getGadgetId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static WidgetGadgetData parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return WidgetGadgetData.PARSER.parseFrom(data);
        }
        
        public static WidgetGadgetData parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetGadgetData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetGadgetData parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return WidgetGadgetData.PARSER.parseFrom(data);
        }
        
        public static WidgetGadgetData parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetGadgetData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetGadgetData parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return WidgetGadgetData.PARSER.parseFrom(data);
        }
        
        public static WidgetGadgetData parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WidgetGadgetData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WidgetGadgetData parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetGadgetData.PARSER, input);
        }
        
        public static WidgetGadgetData parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetGadgetData.PARSER, input, extensionRegistry);
        }
        
        public static WidgetGadgetData parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WidgetGadgetData.PARSER, input);
        }
        
        public static WidgetGadgetData parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WidgetGadgetData.PARSER, input, extensionRegistry);
        }
        
        public static WidgetGadgetData parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetGadgetData.PARSER, input);
        }
        
        public static WidgetGadgetData parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WidgetGadgetData.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return WidgetGadgetData.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final WidgetGadgetData prototype) {
            return WidgetGadgetData.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == WidgetGadgetData.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static WidgetGadgetData getDefaultInstance() {
            return WidgetGadgetData.DEFAULT_INSTANCE;
        }
        
        public static Parser<WidgetGadgetData> parser() {
            return WidgetGadgetData.PARSER;
        }
        
        @Override
        public Parser<WidgetGadgetData> getParserForType() {
            return WidgetGadgetData.PARSER;
        }
        
        @Override
        public WidgetGadgetData getDefaultInstanceForType() {
            return WidgetGadgetData.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new WidgetGadgetData();
            PARSER = new AbstractParser<WidgetGadgetData>() {
                @Override
                public WidgetGadgetData parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new WidgetGadgetData(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WidgetGadgetDataOrBuilder
        {
            private int bitField0_;
            private Internal.IntList gadgetEntityIdList_;
            private int gadgetId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return WidgetGadgetDataOuterClass.internal_static_WidgetGadgetData_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return WidgetGadgetDataOuterClass.internal_static_WidgetGadgetData_fieldAccessorTable.ensureFieldAccessorsInitialized(WidgetGadgetData.class, Builder.class);
            }
            
            private Builder() {
                this.gadgetEntityIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.gadgetEntityIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (WidgetGadgetData.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.gadgetEntityIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.gadgetId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return WidgetGadgetDataOuterClass.internal_static_WidgetGadgetData_descriptor;
            }
            
            @Override
            public WidgetGadgetData getDefaultInstanceForType() {
                return WidgetGadgetData.getDefaultInstance();
            }
            
            @Override
            public WidgetGadgetData build() {
                final WidgetGadgetData result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public WidgetGadgetData buildPartial() {
                final WidgetGadgetData result = new WidgetGadgetData(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.gadgetEntityIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.gadgetEntityIdList_ = this.gadgetEntityIdList_;
                result.gadgetId_ = this.gadgetId_;
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
                if (other instanceof WidgetGadgetData) {
                    return this.mergeFrom((WidgetGadgetData)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final WidgetGadgetData other) {
                if (other == WidgetGadgetData.getDefaultInstance()) {
                    return this;
                }
                if (!other.gadgetEntityIdList_.isEmpty()) {
                    if (this.gadgetEntityIdList_.isEmpty()) {
                        this.gadgetEntityIdList_ = other.gadgetEntityIdList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureGadgetEntityIdListIsMutable();
                        this.gadgetEntityIdList_.addAll(other.gadgetEntityIdList_);
                    }
                    this.onChanged();
                }
                if (other.getGadgetId() != 0) {
                    this.setGadgetId(other.getGadgetId());
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
                WidgetGadgetData parsedMessage = null;
                try {
                    parsedMessage = WidgetGadgetData.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (WidgetGadgetData)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureGadgetEntityIdListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.gadgetEntityIdList_ = GeneratedMessageV3.mutableCopy(this.gadgetEntityIdList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getGadgetEntityIdListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.gadgetEntityIdList_) : this.gadgetEntityIdList_;
            }
            
            @Override
            public int getGadgetEntityIdListCount() {
                return this.gadgetEntityIdList_.size();
            }
            
            @Override
            public int getGadgetEntityIdList(final int index) {
                return this.gadgetEntityIdList_.getInt(index);
            }
            
            public Builder setGadgetEntityIdList(final int index, final int value) {
                this.ensureGadgetEntityIdListIsMutable();
                this.gadgetEntityIdList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addGadgetEntityIdList(final int value) {
                this.ensureGadgetEntityIdListIsMutable();
                this.gadgetEntityIdList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllGadgetEntityIdList(final Iterable<? extends Integer> values) {
                this.ensureGadgetEntityIdListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.gadgetEntityIdList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearGadgetEntityIdList() {
                this.gadgetEntityIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getGadgetId() {
                return this.gadgetId_;
            }
            
            public Builder setGadgetId(final int value) {
                this.gadgetId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGadgetId() {
                this.gadgetId_ = 0;
                this.onChanged();
                return this;
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
    
    public interface WidgetGadgetDataOrBuilder extends MessageOrBuilder
    {
        List<Integer> getGadgetEntityIdListList();
        
        int getGadgetEntityIdListCount();
        
        int getGadgetEntityIdList(final int p0);
        
        int getGadgetId();
    }
}
