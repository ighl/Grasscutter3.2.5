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
import com.google.protobuf.Internal;
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

public final class AvatarAddNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_AvatarAddNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AvatarAddNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AvatarAddNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AvatarAddNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0015AvatarAddNotify.proto\u001a\u0010AvatarInfo.proto\"B\n\u000fAvatarAddNotify\u0012\u001b\n\u0006avatar\u0018\r \u0001(\u000b2\u000b.AvatarInfo\u0012\u0012\n\nis_in_team\u0018\f \u0001(\bB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AvatarAddNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { AvatarInfoOuterClass.getDescriptor() });
        internal_static_AvatarAddNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AvatarAddNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AvatarAddNotifyOuterClass.internal_static_AvatarAddNotify_descriptor, new String[] { "Avatar", "IsInTeam" });
        AvatarInfoOuterClass.getDescriptor();
    }
    
    public static final class AvatarAddNotify extends GeneratedMessageV3 implements AvatarAddNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int AVATAR_FIELD_NUMBER = 13;
        private AvatarInfoOuterClass.AvatarInfo avatar_;
        public static final int IS_IN_TEAM_FIELD_NUMBER = 12;
        private boolean isInTeam_;
        private byte memoizedIsInitialized;
        private static final AvatarAddNotify DEFAULT_INSTANCE;
        private static final Parser<AvatarAddNotify> PARSER;
        
        private AvatarAddNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AvatarAddNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AvatarAddNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AvatarAddNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 96: {
                            this.isInTeam_ = input.readBool();
                            continue;
                        }
                        case 106: {
                            AvatarInfoOuterClass.AvatarInfo.Builder subBuilder = null;
                            if (this.avatar_ != null) {
                                subBuilder = this.avatar_.toBuilder();
                            }
                            this.avatar_ = input.readMessage(AvatarInfoOuterClass.AvatarInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.avatar_);
                                this.avatar_ = subBuilder.buildPartial();
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
            return AvatarAddNotifyOuterClass.internal_static_AvatarAddNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AvatarAddNotifyOuterClass.internal_static_AvatarAddNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarAddNotify.class, Builder.class);
        }
        
        @Override
        public boolean hasAvatar() {
            return this.avatar_ != null;
        }
        
        @Override
        public AvatarInfoOuterClass.AvatarInfo getAvatar() {
            return (this.avatar_ == null) ? AvatarInfoOuterClass.AvatarInfo.getDefaultInstance() : this.avatar_;
        }
        
        @Override
        public AvatarInfoOuterClass.AvatarInfoOrBuilder getAvatarOrBuilder() {
            return this.getAvatar();
        }
        
        @Override
        public boolean getIsInTeam() {
            return this.isInTeam_;
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
            if (this.isInTeam_) {
                output.writeBool(12, this.isInTeam_);
            }
            if (this.avatar_ != null) {
                output.writeMessage(13, this.getAvatar());
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
            if (this.isInTeam_) {
                size += CodedOutputStream.computeBoolSize(12, this.isInTeam_);
            }
            if (this.avatar_ != null) {
                size += CodedOutputStream.computeMessageSize(13, this.getAvatar());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AvatarAddNotify)) {
                return super.equals(obj);
            }
            final AvatarAddNotify other = (AvatarAddNotify)obj;
            return this.hasAvatar() == other.hasAvatar() && (!this.hasAvatar() || this.getAvatar().equals(other.getAvatar())) && this.getIsInTeam() == other.getIsInTeam() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasAvatar()) {
                hash = 37 * hash + 13;
                hash = 53 * hash + this.getAvatar().hashCode();
            }
            hash = 37 * hash + 12;
            hash = 53 * hash + Internal.hashBoolean(this.getIsInTeam());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AvatarAddNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AvatarAddNotify.PARSER.parseFrom(data);
        }
        
        public static AvatarAddNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarAddNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarAddNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AvatarAddNotify.PARSER.parseFrom(data);
        }
        
        public static AvatarAddNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarAddNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarAddNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AvatarAddNotify.PARSER.parseFrom(data);
        }
        
        public static AvatarAddNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarAddNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarAddNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarAddNotify.PARSER, input);
        }
        
        public static AvatarAddNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarAddNotify.PARSER, input, extensionRegistry);
        }
        
        public static AvatarAddNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarAddNotify.PARSER, input);
        }
        
        public static AvatarAddNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarAddNotify.PARSER, input, extensionRegistry);
        }
        
        public static AvatarAddNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarAddNotify.PARSER, input);
        }
        
        public static AvatarAddNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarAddNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AvatarAddNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AvatarAddNotify prototype) {
            return AvatarAddNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AvatarAddNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AvatarAddNotify getDefaultInstance() {
            return AvatarAddNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<AvatarAddNotify> parser() {
            return AvatarAddNotify.PARSER;
        }
        
        @Override
        public Parser<AvatarAddNotify> getParserForType() {
            return AvatarAddNotify.PARSER;
        }
        
        @Override
        public AvatarAddNotify getDefaultInstanceForType() {
            return AvatarAddNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AvatarAddNotify();
            PARSER = new AbstractParser<AvatarAddNotify>() {
                @Override
                public AvatarAddNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AvatarAddNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AvatarAddNotifyOrBuilder
        {
            private AvatarInfoOuterClass.AvatarInfo avatar_;
            private SingleFieldBuilderV3<AvatarInfoOuterClass.AvatarInfo, AvatarInfoOuterClass.AvatarInfo.Builder, AvatarInfoOuterClass.AvatarInfoOrBuilder> avatarBuilder_;
            private boolean isInTeam_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AvatarAddNotifyOuterClass.internal_static_AvatarAddNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AvatarAddNotifyOuterClass.internal_static_AvatarAddNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarAddNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AvatarAddNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.avatarBuilder_ == null) {
                    this.avatar_ = null;
                }
                else {
                    this.avatar_ = null;
                    this.avatarBuilder_ = null;
                }
                this.isInTeam_ = false;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AvatarAddNotifyOuterClass.internal_static_AvatarAddNotify_descriptor;
            }
            
            @Override
            public AvatarAddNotify getDefaultInstanceForType() {
                return AvatarAddNotify.getDefaultInstance();
            }
            
            @Override
            public AvatarAddNotify build() {
                final AvatarAddNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AvatarAddNotify buildPartial() {
                final AvatarAddNotify result = new AvatarAddNotify(this);
                if (this.avatarBuilder_ == null) {
                    result.avatar_ = this.avatar_;
                }
                else {
                    result.avatar_ = this.avatarBuilder_.build();
                }
                result.isInTeam_ = this.isInTeam_;
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
                if (other instanceof AvatarAddNotify) {
                    return this.mergeFrom((AvatarAddNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AvatarAddNotify other) {
                if (other == AvatarAddNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.hasAvatar()) {
                    this.mergeAvatar(other.getAvatar());
                }
                if (other.getIsInTeam()) {
                    this.setIsInTeam(other.getIsInTeam());
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
                AvatarAddNotify parsedMessage = null;
                try {
                    parsedMessage = AvatarAddNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AvatarAddNotify)e.getUnfinishedMessage();
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
            public boolean hasAvatar() {
                return this.avatarBuilder_ != null || this.avatar_ != null;
            }
            
            @Override
            public AvatarInfoOuterClass.AvatarInfo getAvatar() {
                if (this.avatarBuilder_ == null) {
                    return (this.avatar_ == null) ? AvatarInfoOuterClass.AvatarInfo.getDefaultInstance() : this.avatar_;
                }
                return this.avatarBuilder_.getMessage();
            }
            
            public Builder setAvatar(final AvatarInfoOuterClass.AvatarInfo value) {
                if (this.avatarBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.avatar_ = value;
                    this.onChanged();
                }
                else {
                    this.avatarBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setAvatar(final AvatarInfoOuterClass.AvatarInfo.Builder builderForValue) {
                if (this.avatarBuilder_ == null) {
                    this.avatar_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.avatarBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeAvatar(final AvatarInfoOuterClass.AvatarInfo value) {
                if (this.avatarBuilder_ == null) {
                    if (this.avatar_ != null) {
                        this.avatar_ = AvatarInfoOuterClass.AvatarInfo.newBuilder(this.avatar_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.avatar_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.avatarBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearAvatar() {
                if (this.avatarBuilder_ == null) {
                    this.avatar_ = null;
                    this.onChanged();
                }
                else {
                    this.avatar_ = null;
                    this.avatarBuilder_ = null;
                }
                return this;
            }
            
            public AvatarInfoOuterClass.AvatarInfo.Builder getAvatarBuilder() {
                this.onChanged();
                return this.getAvatarFieldBuilder().getBuilder();
            }
            
            @Override
            public AvatarInfoOuterClass.AvatarInfoOrBuilder getAvatarOrBuilder() {
                if (this.avatarBuilder_ != null) {
                    return this.avatarBuilder_.getMessageOrBuilder();
                }
                return (this.avatar_ == null) ? AvatarInfoOuterClass.AvatarInfo.getDefaultInstance() : this.avatar_;
            }
            
            private SingleFieldBuilderV3<AvatarInfoOuterClass.AvatarInfo, AvatarInfoOuterClass.AvatarInfo.Builder, AvatarInfoOuterClass.AvatarInfoOrBuilder> getAvatarFieldBuilder() {
                if (this.avatarBuilder_ == null) {
                    this.avatarBuilder_ = new SingleFieldBuilderV3<AvatarInfoOuterClass.AvatarInfo, AvatarInfoOuterClass.AvatarInfo.Builder, AvatarInfoOuterClass.AvatarInfoOrBuilder>(this.getAvatar(), this.getParentForChildren(), this.isClean());
                    this.avatar_ = null;
                }
                return this.avatarBuilder_;
            }
            
            @Override
            public boolean getIsInTeam() {
                return this.isInTeam_;
            }
            
            public Builder setIsInTeam(final boolean value) {
                this.isInTeam_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsInTeam() {
                this.isInTeam_ = false;
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
    
    public interface AvatarAddNotifyOrBuilder extends MessageOrBuilder
    {
        boolean hasAvatar();
        
        AvatarInfoOuterClass.AvatarInfo getAvatar();
        
        AvatarInfoOuterClass.AvatarInfoOrBuilder getAvatarOrBuilder();
        
        boolean getIsInTeam();
    }
}
