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

public final class SceneKickPlayerNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_SceneKickPlayerNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SceneKickPlayerNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private SceneKickPlayerNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return SceneKickPlayerNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bSceneKickPlayerNotify.proto\"?\n\u0015SceneKickPlayerNotify\u0012\u0012\n\ntarget_uid\u0018\b \u0001(\r\u0012\u0012\n\nkicker_uid\u0018\t \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        SceneKickPlayerNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_SceneKickPlayerNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SceneKickPlayerNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SceneKickPlayerNotifyOuterClass.internal_static_SceneKickPlayerNotify_descriptor, new String[] { "TargetUid", "KickerUid" });
    }
    
    public static final class SceneKickPlayerNotify extends GeneratedMessageV3 implements SceneKickPlayerNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int TARGET_UID_FIELD_NUMBER = 8;
        private int targetUid_;
        public static final int KICKER_UID_FIELD_NUMBER = 9;
        private int kickerUid_;
        private byte memoizedIsInitialized;
        private static final SceneKickPlayerNotify DEFAULT_INSTANCE;
        private static final Parser<SceneKickPlayerNotify> PARSER;
        
        private SceneKickPlayerNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private SceneKickPlayerNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new SceneKickPlayerNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private SceneKickPlayerNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 64: {
                            this.targetUid_ = input.readUInt32();
                            continue;
                        }
                        case 72: {
                            this.kickerUid_ = input.readUInt32();
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
            return SceneKickPlayerNotifyOuterClass.internal_static_SceneKickPlayerNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return SceneKickPlayerNotifyOuterClass.internal_static_SceneKickPlayerNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(SceneKickPlayerNotify.class, Builder.class);
        }
        
        @Override
        public int getTargetUid() {
            return this.targetUid_;
        }
        
        @Override
        public int getKickerUid() {
            return this.kickerUid_;
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
            if (this.targetUid_ != 0) {
                output.writeUInt32(8, this.targetUid_);
            }
            if (this.kickerUid_ != 0) {
                output.writeUInt32(9, this.kickerUid_);
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
            if (this.targetUid_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.targetUid_);
            }
            if (this.kickerUid_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.kickerUid_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SceneKickPlayerNotify)) {
                return super.equals(obj);
            }
            final SceneKickPlayerNotify other = (SceneKickPlayerNotify)obj;
            return this.getTargetUid() == other.getTargetUid() && this.getKickerUid() == other.getKickerUid() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getTargetUid();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getKickerUid();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static SceneKickPlayerNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return SceneKickPlayerNotify.PARSER.parseFrom(data);
        }
        
        public static SceneKickPlayerNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneKickPlayerNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneKickPlayerNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return SceneKickPlayerNotify.PARSER.parseFrom(data);
        }
        
        public static SceneKickPlayerNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneKickPlayerNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneKickPlayerNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return SceneKickPlayerNotify.PARSER.parseFrom(data);
        }
        
        public static SceneKickPlayerNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneKickPlayerNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneKickPlayerNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneKickPlayerNotify.PARSER, input);
        }
        
        public static SceneKickPlayerNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneKickPlayerNotify.PARSER, input, extensionRegistry);
        }
        
        public static SceneKickPlayerNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SceneKickPlayerNotify.PARSER, input);
        }
        
        public static SceneKickPlayerNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SceneKickPlayerNotify.PARSER, input, extensionRegistry);
        }
        
        public static SceneKickPlayerNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneKickPlayerNotify.PARSER, input);
        }
        
        public static SceneKickPlayerNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneKickPlayerNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return SceneKickPlayerNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final SceneKickPlayerNotify prototype) {
            return SceneKickPlayerNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == SceneKickPlayerNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static SceneKickPlayerNotify getDefaultInstance() {
            return SceneKickPlayerNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<SceneKickPlayerNotify> parser() {
            return SceneKickPlayerNotify.PARSER;
        }
        
        @Override
        public Parser<SceneKickPlayerNotify> getParserForType() {
            return SceneKickPlayerNotify.PARSER;
        }
        
        @Override
        public SceneKickPlayerNotify getDefaultInstanceForType() {
            return SceneKickPlayerNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new SceneKickPlayerNotify();
            PARSER = new AbstractParser<SceneKickPlayerNotify>() {
                @Override
                public SceneKickPlayerNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new SceneKickPlayerNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SceneKickPlayerNotifyOrBuilder
        {
            private int targetUid_;
            private int kickerUid_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return SceneKickPlayerNotifyOuterClass.internal_static_SceneKickPlayerNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return SceneKickPlayerNotifyOuterClass.internal_static_SceneKickPlayerNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(SceneKickPlayerNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (SceneKickPlayerNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.targetUid_ = 0;
                this.kickerUid_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return SceneKickPlayerNotifyOuterClass.internal_static_SceneKickPlayerNotify_descriptor;
            }
            
            @Override
            public SceneKickPlayerNotify getDefaultInstanceForType() {
                return SceneKickPlayerNotify.getDefaultInstance();
            }
            
            @Override
            public SceneKickPlayerNotify build() {
                final SceneKickPlayerNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public SceneKickPlayerNotify buildPartial() {
                final SceneKickPlayerNotify result = new SceneKickPlayerNotify(this);
                result.targetUid_ = this.targetUid_;
                result.kickerUid_ = this.kickerUid_;
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
                if (other instanceof SceneKickPlayerNotify) {
                    return this.mergeFrom((SceneKickPlayerNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final SceneKickPlayerNotify other) {
                if (other == SceneKickPlayerNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getTargetUid() != 0) {
                    this.setTargetUid(other.getTargetUid());
                }
                if (other.getKickerUid() != 0) {
                    this.setKickerUid(other.getKickerUid());
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
                SceneKickPlayerNotify parsedMessage = null;
                try {
                    parsedMessage = SceneKickPlayerNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (SceneKickPlayerNotify)e.getUnfinishedMessage();
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
            public int getTargetUid() {
                return this.targetUid_;
            }
            
            public Builder setTargetUid(final int value) {
                this.targetUid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTargetUid() {
                this.targetUid_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getKickerUid() {
                return this.kickerUid_;
            }
            
            public Builder setKickerUid(final int value) {
                this.kickerUid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearKickerUid() {
                this.kickerUid_ = 0;
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
    
    public interface SceneKickPlayerNotifyOrBuilder extends MessageOrBuilder
    {
        int getTargetUid();
        
        int getKickerUid();
    }
}
