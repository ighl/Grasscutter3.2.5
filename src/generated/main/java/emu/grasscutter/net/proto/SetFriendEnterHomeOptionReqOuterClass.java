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

public final class SetFriendEnterHomeOptionReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_SetFriendEnterHomeOptionReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SetFriendEnterHomeOptionReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private SetFriendEnterHomeOptionReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return SetFriendEnterHomeOptionReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n!SetFriendEnterHomeOptionReq.proto\u001a\u001bFriendEnterHomeOption.proto\"E\n\u001bSetFriendEnterHomeOptionReq\u0012&\n\u0006option\u0018\u0007 \u0001(\u000e2\u0016.FriendEnterHomeOptionB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        SetFriendEnterHomeOptionReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { FriendEnterHomeOptionOuterClass.getDescriptor() });
        internal_static_SetFriendEnterHomeOptionReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SetFriendEnterHomeOptionReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SetFriendEnterHomeOptionReqOuterClass.internal_static_SetFriendEnterHomeOptionReq_descriptor, new String[] { "Option" });
        FriendEnterHomeOptionOuterClass.getDescriptor();
    }
    
    public static final class SetFriendEnterHomeOptionReq extends GeneratedMessageV3 implements SetFriendEnterHomeOptionReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int OPTION_FIELD_NUMBER = 7;
        private int option_;
        private byte memoizedIsInitialized;
        private static final SetFriendEnterHomeOptionReq DEFAULT_INSTANCE;
        private static final Parser<SetFriendEnterHomeOptionReq> PARSER;
        
        private SetFriendEnterHomeOptionReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private SetFriendEnterHomeOptionReq() {
            this.memoizedIsInitialized = -1;
            this.option_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new SetFriendEnterHomeOptionReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private SetFriendEnterHomeOptionReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 56: {
                            final int rawValue = input.readEnum();
                            this.option_ = rawValue;
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
            return SetFriendEnterHomeOptionReqOuterClass.internal_static_SetFriendEnterHomeOptionReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return SetFriendEnterHomeOptionReqOuterClass.internal_static_SetFriendEnterHomeOptionReq_fieldAccessorTable.ensureFieldAccessorsInitialized(SetFriendEnterHomeOptionReq.class, Builder.class);
        }
        
        @Override
        public int getOptionValue() {
            return this.option_;
        }
        
        @Override
        public FriendEnterHomeOptionOuterClass.FriendEnterHomeOption getOption() {
            final FriendEnterHomeOptionOuterClass.FriendEnterHomeOption result = FriendEnterHomeOptionOuterClass.FriendEnterHomeOption.valueOf(this.option_);
            return (result == null) ? FriendEnterHomeOptionOuterClass.FriendEnterHomeOption.UNRECOGNIZED : result;
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
            if (this.option_ != FriendEnterHomeOptionOuterClass.FriendEnterHomeOption.FRIEND_ENTER_HOME_OPTION_NEED_CONFIRM.getNumber()) {
                output.writeEnum(7, this.option_);
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
            if (this.option_ != FriendEnterHomeOptionOuterClass.FriendEnterHomeOption.FRIEND_ENTER_HOME_OPTION_NEED_CONFIRM.getNumber()) {
                size += CodedOutputStream.computeEnumSize(7, this.option_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SetFriendEnterHomeOptionReq)) {
                return super.equals(obj);
            }
            final SetFriendEnterHomeOptionReq other = (SetFriendEnterHomeOptionReq)obj;
            return this.option_ == other.option_ && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 7;
            hash = 53 * hash + this.option_;
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static SetFriendEnterHomeOptionReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return SetFriendEnterHomeOptionReq.PARSER.parseFrom(data);
        }
        
        public static SetFriendEnterHomeOptionReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SetFriendEnterHomeOptionReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SetFriendEnterHomeOptionReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return SetFriendEnterHomeOptionReq.PARSER.parseFrom(data);
        }
        
        public static SetFriendEnterHomeOptionReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SetFriendEnterHomeOptionReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SetFriendEnterHomeOptionReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return SetFriendEnterHomeOptionReq.PARSER.parseFrom(data);
        }
        
        public static SetFriendEnterHomeOptionReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SetFriendEnterHomeOptionReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SetFriendEnterHomeOptionReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetFriendEnterHomeOptionReq.PARSER, input);
        }
        
        public static SetFriendEnterHomeOptionReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetFriendEnterHomeOptionReq.PARSER, input, extensionRegistry);
        }
        
        public static SetFriendEnterHomeOptionReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SetFriendEnterHomeOptionReq.PARSER, input);
        }
        
        public static SetFriendEnterHomeOptionReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SetFriendEnterHomeOptionReq.PARSER, input, extensionRegistry);
        }
        
        public static SetFriendEnterHomeOptionReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetFriendEnterHomeOptionReq.PARSER, input);
        }
        
        public static SetFriendEnterHomeOptionReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SetFriendEnterHomeOptionReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return SetFriendEnterHomeOptionReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final SetFriendEnterHomeOptionReq prototype) {
            return SetFriendEnterHomeOptionReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == SetFriendEnterHomeOptionReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static SetFriendEnterHomeOptionReq getDefaultInstance() {
            return SetFriendEnterHomeOptionReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<SetFriendEnterHomeOptionReq> parser() {
            return SetFriendEnterHomeOptionReq.PARSER;
        }
        
        @Override
        public Parser<SetFriendEnterHomeOptionReq> getParserForType() {
            return SetFriendEnterHomeOptionReq.PARSER;
        }
        
        @Override
        public SetFriendEnterHomeOptionReq getDefaultInstanceForType() {
            return SetFriendEnterHomeOptionReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new SetFriendEnterHomeOptionReq();
            PARSER = new AbstractParser<SetFriendEnterHomeOptionReq>() {
                @Override
                public SetFriendEnterHomeOptionReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new SetFriendEnterHomeOptionReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SetFriendEnterHomeOptionReqOrBuilder
        {
            private int option_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return SetFriendEnterHomeOptionReqOuterClass.internal_static_SetFriendEnterHomeOptionReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return SetFriendEnterHomeOptionReqOuterClass.internal_static_SetFriendEnterHomeOptionReq_fieldAccessorTable.ensureFieldAccessorsInitialized(SetFriendEnterHomeOptionReq.class, Builder.class);
            }
            
            private Builder() {
                this.option_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.option_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (SetFriendEnterHomeOptionReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.option_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return SetFriendEnterHomeOptionReqOuterClass.internal_static_SetFriendEnterHomeOptionReq_descriptor;
            }
            
            @Override
            public SetFriendEnterHomeOptionReq getDefaultInstanceForType() {
                return SetFriendEnterHomeOptionReq.getDefaultInstance();
            }
            
            @Override
            public SetFriendEnterHomeOptionReq build() {
                final SetFriendEnterHomeOptionReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public SetFriendEnterHomeOptionReq buildPartial() {
                final SetFriendEnterHomeOptionReq result = new SetFriendEnterHomeOptionReq(this);
                result.option_ = this.option_;
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
                if (other instanceof SetFriendEnterHomeOptionReq) {
                    return this.mergeFrom((SetFriendEnterHomeOptionReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final SetFriendEnterHomeOptionReq other) {
                if (other == SetFriendEnterHomeOptionReq.getDefaultInstance()) {
                    return this;
                }
                if (other.option_ != 0) {
                    this.setOptionValue(other.getOptionValue());
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
                SetFriendEnterHomeOptionReq parsedMessage = null;
                try {
                    parsedMessage = SetFriendEnterHomeOptionReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (SetFriendEnterHomeOptionReq)e.getUnfinishedMessage();
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
            public int getOptionValue() {
                return this.option_;
            }
            
            public Builder setOptionValue(final int value) {
                this.option_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public FriendEnterHomeOptionOuterClass.FriendEnterHomeOption getOption() {
                final FriendEnterHomeOptionOuterClass.FriendEnterHomeOption result = FriendEnterHomeOptionOuterClass.FriendEnterHomeOption.valueOf(this.option_);
                return (result == null) ? FriendEnterHomeOptionOuterClass.FriendEnterHomeOption.UNRECOGNIZED : result;
            }
            
            public Builder setOption(final FriendEnterHomeOptionOuterClass.FriendEnterHomeOption value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.option_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearOption() {
                this.option_ = 0;
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
    
    public interface SetFriendEnterHomeOptionReqOrBuilder extends MessageOrBuilder
    {
        int getOptionValue();
        
        FriendEnterHomeOptionOuterClass.FriendEnterHomeOption getOption();
    }
}
