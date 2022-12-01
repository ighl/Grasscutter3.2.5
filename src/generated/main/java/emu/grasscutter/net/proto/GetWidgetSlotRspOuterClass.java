// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
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

public final class GetWidgetSlotRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_GetWidgetSlotRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GetWidgetSlotRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private GetWidgetSlotRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return GetWidgetSlotRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016GetWidgetSlotRsp.proto\u001a\u0014WidgetSlotData.proto\"G\n\u0010GetWidgetSlotRsp\u0012\"\n\tslot_list\u0018\r \u0003(\u000b2\u000f.WidgetSlotData\u0012\u000f\n\u0007retcode\u0018\t \u0001(\u0005B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        GetWidgetSlotRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { WidgetSlotDataOuterClass.getDescriptor() });
        internal_static_GetWidgetSlotRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GetWidgetSlotRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(GetWidgetSlotRspOuterClass.internal_static_GetWidgetSlotRsp_descriptor, new String[] { "SlotList", "Retcode" });
        WidgetSlotDataOuterClass.getDescriptor();
    }
    
    public static final class GetWidgetSlotRsp extends GeneratedMessageV3 implements GetWidgetSlotRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int SLOT_LIST_FIELD_NUMBER = 13;
        private List<WidgetSlotDataOuterClass.WidgetSlotData> slotList_;
        public static final int RETCODE_FIELD_NUMBER = 9;
        private int retcode_;
        private byte memoizedIsInitialized;
        private static final GetWidgetSlotRsp DEFAULT_INSTANCE;
        private static final Parser<GetWidgetSlotRsp> PARSER;
        
        private GetWidgetSlotRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private GetWidgetSlotRsp() {
            this.memoizedIsInitialized = -1;
            this.slotList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new GetWidgetSlotRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private GetWidgetSlotRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 72: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 106: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.slotList_ = new ArrayList<WidgetSlotDataOuterClass.WidgetSlotData>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.slotList_.add(input.readMessage(WidgetSlotDataOuterClass.WidgetSlotData.parser(), extensionRegistry));
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
                    this.slotList_ = Collections.unmodifiableList((List<? extends WidgetSlotDataOuterClass.WidgetSlotData>)this.slotList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return GetWidgetSlotRspOuterClass.internal_static_GetWidgetSlotRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return GetWidgetSlotRspOuterClass.internal_static_GetWidgetSlotRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(GetWidgetSlotRsp.class, Builder.class);
        }
        
        @Override
        public List<WidgetSlotDataOuterClass.WidgetSlotData> getSlotListList() {
            return this.slotList_;
        }
        
        @Override
        public List<? extends WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> getSlotListOrBuilderList() {
            return this.slotList_;
        }
        
        @Override
        public int getSlotListCount() {
            return this.slotList_.size();
        }
        
        @Override
        public WidgetSlotDataOuterClass.WidgetSlotData getSlotList(final int index) {
            return this.slotList_.get(index);
        }
        
        @Override
        public WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder getSlotListOrBuilder(final int index) {
            return this.slotList_.get(index);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
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
            if (this.retcode_ != 0) {
                output.writeInt32(9, this.retcode_);
            }
            for (int i = 0; i < this.slotList_.size(); ++i) {
                output.writeMessage(13, this.slotList_.get(i));
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
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(9, this.retcode_);
            }
            for (int i = 0; i < this.slotList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(13, this.slotList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetWidgetSlotRsp)) {
                return super.equals(obj);
            }
            final GetWidgetSlotRsp other = (GetWidgetSlotRsp)obj;
            return this.getSlotListList().equals(other.getSlotListList()) && this.getRetcode() == other.getRetcode() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getSlotListCount() > 0) {
                hash = 37 * hash + 13;
                hash = 53 * hash + this.getSlotListList().hashCode();
            }
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getRetcode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static GetWidgetSlotRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return GetWidgetSlotRsp.PARSER.parseFrom(data);
        }
        
        public static GetWidgetSlotRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetWidgetSlotRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetWidgetSlotRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return GetWidgetSlotRsp.PARSER.parseFrom(data);
        }
        
        public static GetWidgetSlotRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetWidgetSlotRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetWidgetSlotRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return GetWidgetSlotRsp.PARSER.parseFrom(data);
        }
        
        public static GetWidgetSlotRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetWidgetSlotRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetWidgetSlotRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetWidgetSlotRsp.PARSER, input);
        }
        
        public static GetWidgetSlotRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetWidgetSlotRsp.PARSER, input, extensionRegistry);
        }
        
        public static GetWidgetSlotRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetWidgetSlotRsp.PARSER, input);
        }
        
        public static GetWidgetSlotRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetWidgetSlotRsp.PARSER, input, extensionRegistry);
        }
        
        public static GetWidgetSlotRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetWidgetSlotRsp.PARSER, input);
        }
        
        public static GetWidgetSlotRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetWidgetSlotRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return GetWidgetSlotRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final GetWidgetSlotRsp prototype) {
            return GetWidgetSlotRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == GetWidgetSlotRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static GetWidgetSlotRsp getDefaultInstance() {
            return GetWidgetSlotRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<GetWidgetSlotRsp> parser() {
            return GetWidgetSlotRsp.PARSER;
        }
        
        @Override
        public Parser<GetWidgetSlotRsp> getParserForType() {
            return GetWidgetSlotRsp.PARSER;
        }
        
        @Override
        public GetWidgetSlotRsp getDefaultInstanceForType() {
            return GetWidgetSlotRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new GetWidgetSlotRsp();
            PARSER = new AbstractParser<GetWidgetSlotRsp>() {
                @Override
                public GetWidgetSlotRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new GetWidgetSlotRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetWidgetSlotRspOrBuilder
        {
            private int bitField0_;
            private List<WidgetSlotDataOuterClass.WidgetSlotData> slotList_;
            private RepeatedFieldBuilderV3<WidgetSlotDataOuterClass.WidgetSlotData, WidgetSlotDataOuterClass.WidgetSlotData.Builder, WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> slotListBuilder_;
            private int retcode_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return GetWidgetSlotRspOuterClass.internal_static_GetWidgetSlotRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return GetWidgetSlotRspOuterClass.internal_static_GetWidgetSlotRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(GetWidgetSlotRsp.class, Builder.class);
            }
            
            private Builder() {
                this.slotList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.slotList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (GetWidgetSlotRsp.alwaysUseFieldBuilders) {
                    this.getSlotListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.slotListBuilder_ == null) {
                    this.slotList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.slotListBuilder_.clear();
                }
                this.retcode_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return GetWidgetSlotRspOuterClass.internal_static_GetWidgetSlotRsp_descriptor;
            }
            
            @Override
            public GetWidgetSlotRsp getDefaultInstanceForType() {
                return GetWidgetSlotRsp.getDefaultInstance();
            }
            
            @Override
            public GetWidgetSlotRsp build() {
                final GetWidgetSlotRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public GetWidgetSlotRsp buildPartial() {
                final GetWidgetSlotRsp result = new GetWidgetSlotRsp(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.slotListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.slotList_ = Collections.unmodifiableList((List<? extends WidgetSlotDataOuterClass.WidgetSlotData>)this.slotList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.slotList_ = this.slotList_;
                }
                else {
                    result.slotList_ = this.slotListBuilder_.build();
                }
                result.retcode_ = this.retcode_;
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
                if (other instanceof GetWidgetSlotRsp) {
                    return this.mergeFrom((GetWidgetSlotRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final GetWidgetSlotRsp other) {
                if (other == GetWidgetSlotRsp.getDefaultInstance()) {
                    return this;
                }
                if (this.slotListBuilder_ == null) {
                    if (!other.slotList_.isEmpty()) {
                        if (this.slotList_.isEmpty()) {
                            this.slotList_ = other.slotList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureSlotListIsMutable();
                            this.slotList_.addAll(other.slotList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.slotList_.isEmpty()) {
                    if (this.slotListBuilder_.isEmpty()) {
                        this.slotListBuilder_.dispose();
                        this.slotListBuilder_ = null;
                        this.slotList_ = other.slotList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.slotListBuilder_ = (GetWidgetSlotRsp.alwaysUseFieldBuilders ? this.getSlotListFieldBuilder() : null);
                    }
                    else {
                        this.slotListBuilder_.addAllMessages(other.slotList_);
                    }
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
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
                GetWidgetSlotRsp parsedMessage = null;
                try {
                    parsedMessage = GetWidgetSlotRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GetWidgetSlotRsp)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureSlotListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.slotList_ = new ArrayList<WidgetSlotDataOuterClass.WidgetSlotData>(this.slotList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<WidgetSlotDataOuterClass.WidgetSlotData> getSlotListList() {
                if (this.slotListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends WidgetSlotDataOuterClass.WidgetSlotData>)this.slotList_);
                }
                return this.slotListBuilder_.getMessageList();
            }
            
            @Override
            public int getSlotListCount() {
                if (this.slotListBuilder_ == null) {
                    return this.slotList_.size();
                }
                return this.slotListBuilder_.getCount();
            }
            
            @Override
            public WidgetSlotDataOuterClass.WidgetSlotData getSlotList(final int index) {
                if (this.slotListBuilder_ == null) {
                    return this.slotList_.get(index);
                }
                return this.slotListBuilder_.getMessage(index);
            }
            
            public Builder setSlotList(final int index, final WidgetSlotDataOuterClass.WidgetSlotData value) {
                if (this.slotListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureSlotListIsMutable();
                    this.slotList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.slotListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setSlotList(final int index, final WidgetSlotDataOuterClass.WidgetSlotData.Builder builderForValue) {
                if (this.slotListBuilder_ == null) {
                    this.ensureSlotListIsMutable();
                    this.slotList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.slotListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addSlotList(final WidgetSlotDataOuterClass.WidgetSlotData value) {
                if (this.slotListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureSlotListIsMutable();
                    this.slotList_.add(value);
                    this.onChanged();
                }
                else {
                    this.slotListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addSlotList(final int index, final WidgetSlotDataOuterClass.WidgetSlotData value) {
                if (this.slotListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureSlotListIsMutable();
                    this.slotList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.slotListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addSlotList(final WidgetSlotDataOuterClass.WidgetSlotData.Builder builderForValue) {
                if (this.slotListBuilder_ == null) {
                    this.ensureSlotListIsMutable();
                    this.slotList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.slotListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addSlotList(final int index, final WidgetSlotDataOuterClass.WidgetSlotData.Builder builderForValue) {
                if (this.slotListBuilder_ == null) {
                    this.ensureSlotListIsMutable();
                    this.slotList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.slotListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllSlotList(final Iterable<? extends WidgetSlotDataOuterClass.WidgetSlotData> values) {
                if (this.slotListBuilder_ == null) {
                    this.ensureSlotListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.slotList_);
                    this.onChanged();
                }
                else {
                    this.slotListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearSlotList() {
                if (this.slotListBuilder_ == null) {
                    this.slotList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.slotListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeSlotList(final int index) {
                if (this.slotListBuilder_ == null) {
                    this.ensureSlotListIsMutable();
                    this.slotList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.slotListBuilder_.remove(index);
                }
                return this;
            }
            
            public WidgetSlotDataOuterClass.WidgetSlotData.Builder getSlotListBuilder(final int index) {
                return this.getSlotListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder getSlotListOrBuilder(final int index) {
                if (this.slotListBuilder_ == null) {
                    return this.slotList_.get(index);
                }
                return this.slotListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> getSlotListOrBuilderList() {
                if (this.slotListBuilder_ != null) {
                    return this.slotListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder>)this.slotList_);
            }
            
            public WidgetSlotDataOuterClass.WidgetSlotData.Builder addSlotListBuilder() {
                return this.getSlotListFieldBuilder().addBuilder(WidgetSlotDataOuterClass.WidgetSlotData.getDefaultInstance());
            }
            
            public WidgetSlotDataOuterClass.WidgetSlotData.Builder addSlotListBuilder(final int index) {
                return this.getSlotListFieldBuilder().addBuilder(index, WidgetSlotDataOuterClass.WidgetSlotData.getDefaultInstance());
            }
            
            public List<WidgetSlotDataOuterClass.WidgetSlotData.Builder> getSlotListBuilderList() {
                return this.getSlotListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<WidgetSlotDataOuterClass.WidgetSlotData, WidgetSlotDataOuterClass.WidgetSlotData.Builder, WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> getSlotListFieldBuilder() {
                if (this.slotListBuilder_ == null) {
                    this.slotListBuilder_ = new RepeatedFieldBuilderV3<WidgetSlotDataOuterClass.WidgetSlotData, WidgetSlotDataOuterClass.WidgetSlotData.Builder, WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder>(this.slotList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.slotList_ = null;
                }
                return this.slotListBuilder_;
            }
            
            @Override
            public int getRetcode() {
                return this.retcode_;
            }
            
            public Builder setRetcode(final int value) {
                this.retcode_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRetcode() {
                this.retcode_ = 0;
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
    
    public interface GetWidgetSlotRspOrBuilder extends MessageOrBuilder
    {
        List<WidgetSlotDataOuterClass.WidgetSlotData> getSlotListList();
        
        WidgetSlotDataOuterClass.WidgetSlotData getSlotList(final int p0);
        
        int getSlotListCount();
        
        List<? extends WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> getSlotListOrBuilderList();
        
        WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder getSlotListOrBuilder(final int p0);
        
        int getRetcode();
    }
}
