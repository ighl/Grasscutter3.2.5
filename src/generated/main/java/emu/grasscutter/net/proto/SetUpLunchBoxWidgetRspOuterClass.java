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

public final class SetUpLunchBoxWidgetRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_SetUpLunchBoxWidgetRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SetUpLunchBoxWidgetRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private SetUpLunchBoxWidgetRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return SetUpLunchBoxWidgetRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001cSetUpLunchBoxWidgetRsp.proto\u001a\u0012LunchBoxData.proto\"P\n\u0016SetUpLunchBoxWidgetRsp\u0012%\n\u000elunch_box_data\u0018\u0003 \u0001(\u000b2\r.LunchBoxData\u0012\u000f\n\u0007retcode\u0018\r \u0001(\u0005B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        SetUpLunchBoxWidgetRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { LunchBoxDataOuterClass.getDescriptor() });
        internal_static_SetUpLunchBoxWidgetRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SetUpLunchBoxWidgetRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SetUpLunchBoxWidgetRspOuterClass.internal_static_SetUpLunchBoxWidgetRsp_descriptor, new String[] { "LunchBoxData", "Retcode" });
        LunchBoxDataOuterClass.getDescriptor();
    }
    
    public static final class SetUpLunchBoxWidgetRsp extends GeneratedMessageV3 implements SetUpLunchBoxWidgetRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int LUNCH_BOX_DATA_FIELD_NUMBER = 3;
        private LunchBoxDataOuterClass.LunchBoxData lunchBoxData_;
        public static final int RETCODE_FIELD_NUMBER = 13;
        private int retcode_;
        private byte memoizedIsInitialized;
        private static final SetUpLunchBoxWidgetRsp DEFAULT_INSTANCE;
        private static final Parser<SetUpLunchBoxWidgetRsp> PARSER;
        
        private SetUpLunchBoxWidgetRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private SetUpLunchBoxWidgetRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new SetUpLunchBoxWidgetRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private SetUpLunchBoxWidgetRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 26: {
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
                        case 104: {
                            this.retcode_ = input.readInt32();
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
            return SetUpLunchBoxWidgetRspOuterClass.internal_static_SetUpLunchBoxWidgetRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return SetUpLunchBoxWidgetRspOuterClass.internal_static_SetUpLunchBoxWidgetRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(SetUpLunchBoxWidgetRsp.class, Builder.class);
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
            if (this.lunchBoxData_ != null) {
                output.writeMessage(3, this.getLunchBoxData());
            }
            if (this.retcode_ != 0) {
                output.writeInt32(13, this.retcode_);
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
                size += CodedOutputStream.computeMessageSize(3, this.getLunchBoxData());
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(13, this.retcode_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SetUpLunchBoxWidgetRsp)) {
                return super.equals(obj);
            }
            final SetUpLunchBoxWidgetRsp other = (SetUpLunchBoxWidgetRsp)obj;
            return this.hasLunchBoxData() == other.hasLunchBoxData() && (!this.hasLunchBoxData() || this.getLunchBoxData().equals(other.getLunchBoxData())) && this.getRetcode() == other.getRetcode() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasLunchBoxData()) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getLunchBoxData().hashCode();
            }
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getRetcode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static SetUpLunchBoxWidgetRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return SetUpLunchBoxWidgetRsp.PARSER.parseFrom(data);
        }
        
        public static SetUpLunchBoxWidgetRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SetUpLunchBoxWidgetRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SetUpLunchBoxWidgetRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return SetUpLunchBoxWidgetRsp.PARSER.parseFrom(data);
        }
        
        public static SetUpLunchBoxWidgetRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SetUpLunchBoxWidgetRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SetUpLunchBoxWidgetRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return SetUpLunchBoxWidgetRsp.PARSER.parseFrom(data);
        }
        
        public static SetUpLunchBoxWidgetRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SetUpLunchBoxWidgetRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SetUpLunchBoxWidgetRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetUpLunchBoxWidgetRsp.PARSER, input);
        }
        
        public static SetUpLunchBoxWidgetRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetUpLunchBoxWidgetRsp.PARSER, input, extensionRegistry);
        }
        
        public static SetUpLunchBoxWidgetRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SetUpLunchBoxWidgetRsp.PARSER, input);
        }
        
        public static SetUpLunchBoxWidgetRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SetUpLunchBoxWidgetRsp.PARSER, input, extensionRegistry);
        }
        
        public static SetUpLunchBoxWidgetRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetUpLunchBoxWidgetRsp.PARSER, input);
        }
        
        public static SetUpLunchBoxWidgetRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetUpLunchBoxWidgetRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return SetUpLunchBoxWidgetRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final SetUpLunchBoxWidgetRsp prototype) {
            return SetUpLunchBoxWidgetRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == SetUpLunchBoxWidgetRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static SetUpLunchBoxWidgetRsp getDefaultInstance() {
            return SetUpLunchBoxWidgetRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<SetUpLunchBoxWidgetRsp> parser() {
            return SetUpLunchBoxWidgetRsp.PARSER;
        }
        
        @Override
        public Parser<SetUpLunchBoxWidgetRsp> getParserForType() {
            return SetUpLunchBoxWidgetRsp.PARSER;
        }
        
        @Override
        public SetUpLunchBoxWidgetRsp getDefaultInstanceForType() {
            return SetUpLunchBoxWidgetRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new SetUpLunchBoxWidgetRsp();
            PARSER = new AbstractParser<SetUpLunchBoxWidgetRsp>() {
                @Override
                public SetUpLunchBoxWidgetRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new SetUpLunchBoxWidgetRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SetUpLunchBoxWidgetRspOrBuilder
        {
            private LunchBoxDataOuterClass.LunchBoxData lunchBoxData_;
            private SingleFieldBuilderV3<LunchBoxDataOuterClass.LunchBoxData, LunchBoxDataOuterClass.LunchBoxData.Builder, LunchBoxDataOuterClass.LunchBoxDataOrBuilder> lunchBoxDataBuilder_;
            private int retcode_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return SetUpLunchBoxWidgetRspOuterClass.internal_static_SetUpLunchBoxWidgetRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return SetUpLunchBoxWidgetRspOuterClass.internal_static_SetUpLunchBoxWidgetRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(SetUpLunchBoxWidgetRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (SetUpLunchBoxWidgetRsp.alwaysUseFieldBuilders) {}
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
                this.retcode_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return SetUpLunchBoxWidgetRspOuterClass.internal_static_SetUpLunchBoxWidgetRsp_descriptor;
            }
            
            @Override
            public SetUpLunchBoxWidgetRsp getDefaultInstanceForType() {
                return SetUpLunchBoxWidgetRsp.getDefaultInstance();
            }
            
            @Override
            public SetUpLunchBoxWidgetRsp build() {
                final SetUpLunchBoxWidgetRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public SetUpLunchBoxWidgetRsp buildPartial() {
                final SetUpLunchBoxWidgetRsp result = new SetUpLunchBoxWidgetRsp(this);
                if (this.lunchBoxDataBuilder_ == null) {
                    result.lunchBoxData_ = this.lunchBoxData_;
                }
                else {
                    result.lunchBoxData_ = this.lunchBoxDataBuilder_.build();
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
                if (other instanceof SetUpLunchBoxWidgetRsp) {
                    return this.mergeFrom((SetUpLunchBoxWidgetRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final SetUpLunchBoxWidgetRsp other) {
                if (other == SetUpLunchBoxWidgetRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.hasLunchBoxData()) {
                    this.mergeLunchBoxData(other.getLunchBoxData());
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
                SetUpLunchBoxWidgetRsp parsedMessage = null;
                try {
                    parsedMessage = SetUpLunchBoxWidgetRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (SetUpLunchBoxWidgetRsp)e.getUnfinishedMessage();
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
    
    public interface SetUpLunchBoxWidgetRspOrBuilder extends MessageOrBuilder
    {
        boolean hasLunchBoxData();
        
        LunchBoxDataOuterClass.LunchBoxData getLunchBoxData();
        
        LunchBoxDataOuterClass.LunchBoxDataOrBuilder getLunchBoxDataOrBuilder();
        
        int getRetcode();
    }
}
