// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class SetUpLunchBoxWidgetReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_SetUpLunchBoxWidgetReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SetUpLunchBoxWidgetReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private SetUpLunchBoxWidgetReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return SetUpLunchBoxWidgetReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001cSetUpLunchBoxWidgetReq.proto\u001a\u0012LunchBoxData.proto\"?\n\u0016SetUpLunchBoxWidgetReq\u0012%\n\u000elunch_box_data\u0018\u0006 \u0001(\u000b2\r.LunchBoxDataB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        SetUpLunchBoxWidgetReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { LunchBoxDataOuterClass.getDescriptor() });
        internal_static_SetUpLunchBoxWidgetReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SetUpLunchBoxWidgetReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SetUpLunchBoxWidgetReqOuterClass.internal_static_SetUpLunchBoxWidgetReq_descriptor, new String[] { "LunchBoxData" });
        LunchBoxDataOuterClass.getDescriptor();
    }
    
    public static final class SetUpLunchBoxWidgetReq extends GeneratedMessageV3 implements SetUpLunchBoxWidgetReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int LUNCH_BOX_DATA_FIELD_NUMBER = 6;
        private LunchBoxDataOuterClass.LunchBoxData lunchBoxData_;
        private byte memoizedIsInitialized;
        private static final SetUpLunchBoxWidgetReq DEFAULT_INSTANCE;
        private static final Parser<SetUpLunchBoxWidgetReq> PARSER;
        
        private SetUpLunchBoxWidgetReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private SetUpLunchBoxWidgetReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new SetUpLunchBoxWidgetReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private SetUpLunchBoxWidgetReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
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
                            LunchBoxDataOuterClass.LunchBoxData.Builder subBuilder = null;
                            if (this.lunchBoxData_ != null) {
                                subBuilder = this.lunchBoxData_.toBuilder();
                            }
                            this.lunchBoxData_ = input.readMessage(LunchBoxDataOuterClass.LunchBoxData.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.lunchBoxData_);
                                this.lunchBoxData_ = subBuilder.buildPartial();
                                continue;
                            }
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
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return SetUpLunchBoxWidgetReqOuterClass.internal_static_SetUpLunchBoxWidgetReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return SetUpLunchBoxWidgetReqOuterClass.internal_static_SetUpLunchBoxWidgetReq_fieldAccessorTable.ensureFieldAccessorsInitialized(SetUpLunchBoxWidgetReq.class, Builder.class);
        }
        
        @Override
        public boolean hasLunchBoxData() {
            return this.lunchBoxData_ != null;
        }
        
        @Override
        public LunchBoxDataOuterClass.LunchBoxData getLunchBoxData() {
            return (this.lunchBoxData_ == null) ? LunchBoxDataOuterClass.LunchBoxData.getDefaultInstance() : this.lunchBoxData_;
        }
        
        @Override
        public LunchBoxDataOuterClass.LunchBoxDataOrBuilder getLunchBoxDataOrBuilder() {
            return this.getLunchBoxData();
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
            if (this.lunchBoxData_ != null) {
                output.writeMessage(6, this.getLunchBoxData());
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
            if (this.lunchBoxData_ != null) {
                size += CodedOutputStream.computeMessageSize(6, this.getLunchBoxData());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SetUpLunchBoxWidgetReq)) {
                return super.equals(obj);
            }
            final SetUpLunchBoxWidgetReq other = (SetUpLunchBoxWidgetReq)obj;
            return this.hasLunchBoxData() == other.hasLunchBoxData() && (!this.hasLunchBoxData() || this.getLunchBoxData().equals(other.getLunchBoxData())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasLunchBoxData()) {
                hash = 37 * hash + 6;
                hash = 53 * hash + this.getLunchBoxData().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static SetUpLunchBoxWidgetReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return SetUpLunchBoxWidgetReq.PARSER.parseFrom(data);
        }
        
        public static SetUpLunchBoxWidgetReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SetUpLunchBoxWidgetReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SetUpLunchBoxWidgetReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return SetUpLunchBoxWidgetReq.PARSER.parseFrom(data);
        }
        
        public static SetUpLunchBoxWidgetReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SetUpLunchBoxWidgetReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SetUpLunchBoxWidgetReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return SetUpLunchBoxWidgetReq.PARSER.parseFrom(data);
        }
        
        public static SetUpLunchBoxWidgetReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SetUpLunchBoxWidgetReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SetUpLunchBoxWidgetReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetUpLunchBoxWidgetReq.PARSER, input);
        }
        
        public static SetUpLunchBoxWidgetReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetUpLunchBoxWidgetReq.PARSER, input, extensionRegistry);
        }
        
        public static SetUpLunchBoxWidgetReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SetUpLunchBoxWidgetReq.PARSER, input);
        }
        
        public static SetUpLunchBoxWidgetReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SetUpLunchBoxWidgetReq.PARSER, input, extensionRegistry);
        }
        
        public static SetUpLunchBoxWidgetReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetUpLunchBoxWidgetReq.PARSER, input);
        }
        
        public static SetUpLunchBoxWidgetReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetUpLunchBoxWidgetReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return SetUpLunchBoxWidgetReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final SetUpLunchBoxWidgetReq prototype) {
            return SetUpLunchBoxWidgetReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == SetUpLunchBoxWidgetReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static SetUpLunchBoxWidgetReq getDefaultInstance() {
            return SetUpLunchBoxWidgetReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<SetUpLunchBoxWidgetReq> parser() {
            return SetUpLunchBoxWidgetReq.PARSER;
        }
        
        @Override
        public Parser<SetUpLunchBoxWidgetReq> getParserForType() {
            return SetUpLunchBoxWidgetReq.PARSER;
        }
        
        @Override
        public SetUpLunchBoxWidgetReq getDefaultInstanceForType() {
            return SetUpLunchBoxWidgetReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new SetUpLunchBoxWidgetReq();
            PARSER = new AbstractParser<SetUpLunchBoxWidgetReq>() {
                @Override
                public SetUpLunchBoxWidgetReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new SetUpLunchBoxWidgetReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SetUpLunchBoxWidgetReqOrBuilder
        {
            private LunchBoxDataOuterClass.LunchBoxData lunchBoxData_;
            private SingleFieldBuilderV3<LunchBoxDataOuterClass.LunchBoxData, LunchBoxDataOuterClass.LunchBoxData.Builder, LunchBoxDataOuterClass.LunchBoxDataOrBuilder> lunchBoxDataBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return SetUpLunchBoxWidgetReqOuterClass.internal_static_SetUpLunchBoxWidgetReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return SetUpLunchBoxWidgetReqOuterClass.internal_static_SetUpLunchBoxWidgetReq_fieldAccessorTable.ensureFieldAccessorsInitialized(SetUpLunchBoxWidgetReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (SetUpLunchBoxWidgetReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.lunchBoxDataBuilder_ == null) {
                    this.lunchBoxData_ = null;
                }
                else {
                    this.lunchBoxData_ = null;
                    this.lunchBoxDataBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return SetUpLunchBoxWidgetReqOuterClass.internal_static_SetUpLunchBoxWidgetReq_descriptor;
            }
            
            @Override
            public SetUpLunchBoxWidgetReq getDefaultInstanceForType() {
                return SetUpLunchBoxWidgetReq.getDefaultInstance();
            }
            
            @Override
            public SetUpLunchBoxWidgetReq build() {
                final SetUpLunchBoxWidgetReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public SetUpLunchBoxWidgetReq buildPartial() {
                final SetUpLunchBoxWidgetReq result = new SetUpLunchBoxWidgetReq(this);
                if (this.lunchBoxDataBuilder_ == null) {
                    result.lunchBoxData_ = this.lunchBoxData_;
                }
                else {
                    result.lunchBoxData_ = this.lunchBoxDataBuilder_.build();
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
                if (other instanceof SetUpLunchBoxWidgetReq) {
                    return this.mergeFrom((SetUpLunchBoxWidgetReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final SetUpLunchBoxWidgetReq other) {
                if (other == SetUpLunchBoxWidgetReq.getDefaultInstance()) {
                    return this;
                }
                if (other.hasLunchBoxData()) {
                    this.mergeLunchBoxData(other.getLunchBoxData());
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
                SetUpLunchBoxWidgetReq parsedMessage = null;
                try {
                    parsedMessage = SetUpLunchBoxWidgetReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (SetUpLunchBoxWidgetReq)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            @Override
            public boolean hasLunchBoxData() {
                return this.lunchBoxDataBuilder_ != null || this.lunchBoxData_ != null;
            }
            
            @Override
            public LunchBoxDataOuterClass.LunchBoxData getLunchBoxData() {
                if (this.lunchBoxDataBuilder_ == null) {
                    return (this.lunchBoxData_ == null) ? LunchBoxDataOuterClass.LunchBoxData.getDefaultInstance() : this.lunchBoxData_;
                }
                return this.lunchBoxDataBuilder_.getMessage();
            }
            
            public Builder setLunchBoxData(final LunchBoxDataOuterClass.LunchBoxData value) {
                if (this.lunchBoxDataBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.lunchBoxData_ = value;
                    this.onChanged();
                }
                else {
                    this.lunchBoxDataBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setLunchBoxData(final LunchBoxDataOuterClass.LunchBoxData.Builder builderForValue) {
                if (this.lunchBoxDataBuilder_ == null) {
                    this.lunchBoxData_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.lunchBoxDataBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeLunchBoxData(final LunchBoxDataOuterClass.LunchBoxData value) {
                if (this.lunchBoxDataBuilder_ == null) {
                    if (this.lunchBoxData_ != null) {
                        this.lunchBoxData_ = LunchBoxDataOuterClass.LunchBoxData.newBuilder(this.lunchBoxData_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.lunchBoxData_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.lunchBoxDataBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearLunchBoxData() {
                if (this.lunchBoxDataBuilder_ == null) {
                    this.lunchBoxData_ = null;
                    this.onChanged();
                }
                else {
                    this.lunchBoxData_ = null;
                    this.lunchBoxDataBuilder_ = null;
                }
                return this;
            }
            
            public LunchBoxDataOuterClass.LunchBoxData.Builder getLunchBoxDataBuilder() {
                this.onChanged();
                return this.getLunchBoxDataFieldBuilder().getBuilder();
            }
            
            @Override
            public LunchBoxDataOuterClass.LunchBoxDataOrBuilder getLunchBoxDataOrBuilder() {
                if (this.lunchBoxDataBuilder_ != null) {
                    return this.lunchBoxDataBuilder_.getMessageOrBuilder();
                }
                return (this.lunchBoxData_ == null) ? LunchBoxDataOuterClass.LunchBoxData.getDefaultInstance() : this.lunchBoxData_;
            }
            
            private SingleFieldBuilderV3<LunchBoxDataOuterClass.LunchBoxData, LunchBoxDataOuterClass.LunchBoxData.Builder, LunchBoxDataOuterClass.LunchBoxDataOrBuilder> getLunchBoxDataFieldBuilder() {
                if (this.lunchBoxDataBuilder_ == null) {
                    this.lunchBoxDataBuilder_ = new SingleFieldBuilderV3<LunchBoxDataOuterClass.LunchBoxData, LunchBoxDataOuterClass.LunchBoxData.Builder, LunchBoxDataOuterClass.LunchBoxDataOrBuilder>(this.getLunchBoxData(), this.getParentForChildren(), this.isClean());
                    this.lunchBoxData_ = null;
                }
                return this.lunchBoxDataBuilder_;
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
    
    public interface SetUpLunchBoxWidgetReqOrBuilder extends MessageOrBuilder
    {
        boolean hasLunchBoxData();
        
        LunchBoxDataOuterClass.LunchBoxData getLunchBoxData();
        
        LunchBoxDataOuterClass.LunchBoxDataOrBuilder getLunchBoxDataOrBuilder();
    }
}
