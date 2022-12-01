// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
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

public final class SelectWorktopOptionReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_SelectWorktopOptionReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SelectWorktopOptionReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private SelectWorktopOptionReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return SelectWorktopOptionReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001cSelectWorktopOptionReq.proto\"E\n\u0016SelectWorktopOptionReq\u0012\u0018\n\u0010gadget_entity_id\u0018\f \u0001(\r\u0012\u0011\n\toption_id\u0018\u000b \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        SelectWorktopOptionReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_SelectWorktopOptionReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SelectWorktopOptionReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SelectWorktopOptionReqOuterClass.internal_static_SelectWorktopOptionReq_descriptor, new String[] { "GadgetEntityId", "OptionId" });
    }
    
    public static final class SelectWorktopOptionReq extends GeneratedMessageV3 implements SelectWorktopOptionReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int GADGET_ENTITY_ID_FIELD_NUMBER = 12;
        private int gadgetEntityId_;
        public static final int OPTION_ID_FIELD_NUMBER = 11;
        private int optionId_;
        private byte memoizedIsInitialized;
        private static final SelectWorktopOptionReq DEFAULT_INSTANCE;
        private static final Parser<SelectWorktopOptionReq> PARSER;
        
        private SelectWorktopOptionReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private SelectWorktopOptionReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new SelectWorktopOptionReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private SelectWorktopOptionReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 88: {
                            this.optionId_ = input.readUInt32();
                            continue;
                        }
                        case 96: {
                            this.gadgetEntityId_ = input.readUInt32();
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
            return SelectWorktopOptionReqOuterClass.internal_static_SelectWorktopOptionReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return SelectWorktopOptionReqOuterClass.internal_static_SelectWorktopOptionReq_fieldAccessorTable.ensureFieldAccessorsInitialized(SelectWorktopOptionReq.class, Builder.class);
        }
        
        @Override
        public int getGadgetEntityId() {
            return this.gadgetEntityId_;
        }
        
        @Override
        public int getOptionId() {
            return this.optionId_;
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
            if (this.optionId_ != 0) {
                output.writeUInt32(11, this.optionId_);
            }
            if (this.gadgetEntityId_ != 0) {
                output.writeUInt32(12, this.gadgetEntityId_);
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
            if (this.optionId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.optionId_);
            }
            if (this.gadgetEntityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(12, this.gadgetEntityId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SelectWorktopOptionReq)) {
                return super.equals(obj);
            }
            final SelectWorktopOptionReq other = (SelectWorktopOptionReq)obj;
            return this.getGadgetEntityId() == other.getGadgetEntityId() && this.getOptionId() == other.getOptionId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getGadgetEntityId();
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getOptionId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static SelectWorktopOptionReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return SelectWorktopOptionReq.PARSER.parseFrom(data);
        }
        
        public static SelectWorktopOptionReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SelectWorktopOptionReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SelectWorktopOptionReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return SelectWorktopOptionReq.PARSER.parseFrom(data);
        }
        
        public static SelectWorktopOptionReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SelectWorktopOptionReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SelectWorktopOptionReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return SelectWorktopOptionReq.PARSER.parseFrom(data);
        }
        
        public static SelectWorktopOptionReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SelectWorktopOptionReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SelectWorktopOptionReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SelectWorktopOptionReq.PARSER, input);
        }
        
        public static SelectWorktopOptionReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SelectWorktopOptionReq.PARSER, input, extensionRegistry);
        }
        
        public static SelectWorktopOptionReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SelectWorktopOptionReq.PARSER, input);
        }
        
        public static SelectWorktopOptionReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SelectWorktopOptionReq.PARSER, input, extensionRegistry);
        }
        
        public static SelectWorktopOptionReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SelectWorktopOptionReq.PARSER, input);
        }
        
        public static SelectWorktopOptionReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SelectWorktopOptionReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return SelectWorktopOptionReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final SelectWorktopOptionReq prototype) {
            return SelectWorktopOptionReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == SelectWorktopOptionReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static SelectWorktopOptionReq getDefaultInstance() {
            return SelectWorktopOptionReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<SelectWorktopOptionReq> parser() {
            return SelectWorktopOptionReq.PARSER;
        }
        
        @Override
        public Parser<SelectWorktopOptionReq> getParserForType() {
            return SelectWorktopOptionReq.PARSER;
        }
        
        @Override
        public SelectWorktopOptionReq getDefaultInstanceForType() {
            return SelectWorktopOptionReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new SelectWorktopOptionReq();
            PARSER = new AbstractParser<SelectWorktopOptionReq>() {
                @Override
                public SelectWorktopOptionReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new SelectWorktopOptionReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SelectWorktopOptionReqOrBuilder
        {
            private int gadgetEntityId_;
            private int optionId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return SelectWorktopOptionReqOuterClass.internal_static_SelectWorktopOptionReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return SelectWorktopOptionReqOuterClass.internal_static_SelectWorktopOptionReq_fieldAccessorTable.ensureFieldAccessorsInitialized(SelectWorktopOptionReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (SelectWorktopOptionReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.gadgetEntityId_ = 0;
                this.optionId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return SelectWorktopOptionReqOuterClass.internal_static_SelectWorktopOptionReq_descriptor;
            }
            
            @Override
            public SelectWorktopOptionReq getDefaultInstanceForType() {
                return SelectWorktopOptionReq.getDefaultInstance();
            }
            
            @Override
            public SelectWorktopOptionReq build() {
                final SelectWorktopOptionReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public SelectWorktopOptionReq buildPartial() {
                final SelectWorktopOptionReq result = new SelectWorktopOptionReq(this);
                result.gadgetEntityId_ = this.gadgetEntityId_;
                result.optionId_ = this.optionId_;
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
                if (other instanceof SelectWorktopOptionReq) {
                    return this.mergeFrom((SelectWorktopOptionReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final SelectWorktopOptionReq other) {
                if (other == SelectWorktopOptionReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getGadgetEntityId() != 0) {
                    this.setGadgetEntityId(other.getGadgetEntityId());
                }
                if (other.getOptionId() != 0) {
                    this.setOptionId(other.getOptionId());
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
                SelectWorktopOptionReq parsedMessage = null;
                try {
                    parsedMessage = SelectWorktopOptionReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (SelectWorktopOptionReq)e.getUnfinishedMessage();
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
            public int getGadgetEntityId() {
                return this.gadgetEntityId_;
            }
            
            public Builder setGadgetEntityId(final int value) {
                this.gadgetEntityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGadgetEntityId() {
                this.gadgetEntityId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getOptionId() {
                return this.optionId_;
            }
            
            public Builder setOptionId(final int value) {
                this.optionId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearOptionId() {
                this.optionId_ = 0;
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
    
    public interface SelectWorktopOptionReqOrBuilder extends MessageOrBuilder
    {
        int getGadgetEntityId();
        
        int getOptionId();
    }
}
