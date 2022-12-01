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

public final class ScenePlayerInfoNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_ScenePlayerInfoNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_ScenePlayerInfoNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private ScenePlayerInfoNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return ScenePlayerInfoNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bScenePlayerInfoNotify.proto\u001a\u0015ScenePlayerInfo.proto\"C\n\u0015ScenePlayerInfoNotify\u0012*\n\u0010player_info_list\u0018\u000b \u0003(\u000b2\u0010.ScenePlayerInfoB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        ScenePlayerInfoNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ScenePlayerInfoOuterClass.getDescriptor() });
        internal_static_ScenePlayerInfoNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ScenePlayerInfoNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(ScenePlayerInfoNotifyOuterClass.internal_static_ScenePlayerInfoNotify_descriptor, new String[] { "PlayerInfoList" });
        ScenePlayerInfoOuterClass.getDescriptor();
    }
    
    public static final class ScenePlayerInfoNotify extends GeneratedMessageV3 implements ScenePlayerInfoNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int PLAYER_INFO_LIST_FIELD_NUMBER = 11;
        private List<ScenePlayerInfoOuterClass.ScenePlayerInfo> playerInfoList_;
        private byte memoizedIsInitialized;
        private static final ScenePlayerInfoNotify DEFAULT_INSTANCE;
        private static final Parser<ScenePlayerInfoNotify> PARSER;
        
        private ScenePlayerInfoNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private ScenePlayerInfoNotify() {
            this.memoizedIsInitialized = -1;
            this.playerInfoList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new ScenePlayerInfoNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private ScenePlayerInfoNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 90: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.playerInfoList_ = new ArrayList<ScenePlayerInfoOuterClass.ScenePlayerInfo>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.playerInfoList_.add(input.readMessage(ScenePlayerInfoOuterClass.ScenePlayerInfo.parser(), extensionRegistry));
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
                    this.playerInfoList_ = Collections.unmodifiableList((List<? extends ScenePlayerInfoOuterClass.ScenePlayerInfo>)this.playerInfoList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return ScenePlayerInfoNotifyOuterClass.internal_static_ScenePlayerInfoNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return ScenePlayerInfoNotifyOuterClass.internal_static_ScenePlayerInfoNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(ScenePlayerInfoNotify.class, Builder.class);
        }
        
        @Override
        public List<ScenePlayerInfoOuterClass.ScenePlayerInfo> getPlayerInfoListList() {
            return this.playerInfoList_;
        }
        
        @Override
        public List<? extends ScenePlayerInfoOuterClass.ScenePlayerInfoOrBuilder> getPlayerInfoListOrBuilderList() {
            return this.playerInfoList_;
        }
        
        @Override
        public int getPlayerInfoListCount() {
            return this.playerInfoList_.size();
        }
        
        @Override
        public ScenePlayerInfoOuterClass.ScenePlayerInfo getPlayerInfoList(final int index) {
            return this.playerInfoList_.get(index);
        }
        
        @Override
        public ScenePlayerInfoOuterClass.ScenePlayerInfoOrBuilder getPlayerInfoListOrBuilder(final int index) {
            return this.playerInfoList_.get(index);
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
            for (int i = 0; i < this.playerInfoList_.size(); ++i) {
                output.writeMessage(11, this.playerInfoList_.get(i));
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
            for (int i = 0; i < this.playerInfoList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(11, this.playerInfoList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ScenePlayerInfoNotify)) {
                return super.equals(obj);
            }
            final ScenePlayerInfoNotify other = (ScenePlayerInfoNotify)obj;
            return this.getPlayerInfoListList().equals(other.getPlayerInfoListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getPlayerInfoListCount() > 0) {
                hash = 37 * hash + 11;
                hash = 53 * hash + this.getPlayerInfoListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static ScenePlayerInfoNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return ScenePlayerInfoNotify.PARSER.parseFrom(data);
        }
        
        public static ScenePlayerInfoNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ScenePlayerInfoNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ScenePlayerInfoNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return ScenePlayerInfoNotify.PARSER.parseFrom(data);
        }
        
        public static ScenePlayerInfoNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ScenePlayerInfoNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ScenePlayerInfoNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return ScenePlayerInfoNotify.PARSER.parseFrom(data);
        }
        
        public static ScenePlayerInfoNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return ScenePlayerInfoNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static ScenePlayerInfoNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ScenePlayerInfoNotify.PARSER, input);
        }
        
        public static ScenePlayerInfoNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ScenePlayerInfoNotify.PARSER, input, extensionRegistry);
        }
        
        public static ScenePlayerInfoNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ScenePlayerInfoNotify.PARSER, input);
        }
        
        public static ScenePlayerInfoNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(ScenePlayerInfoNotify.PARSER, input, extensionRegistry);
        }
        
        public static ScenePlayerInfoNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ScenePlayerInfoNotify.PARSER, input);
        }
        
        public static ScenePlayerInfoNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(ScenePlayerInfoNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return ScenePlayerInfoNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final ScenePlayerInfoNotify prototype) {
            return ScenePlayerInfoNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == ScenePlayerInfoNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static ScenePlayerInfoNotify getDefaultInstance() {
            return ScenePlayerInfoNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<ScenePlayerInfoNotify> parser() {
            return ScenePlayerInfoNotify.PARSER;
        }
        
        @Override
        public Parser<ScenePlayerInfoNotify> getParserForType() {
            return ScenePlayerInfoNotify.PARSER;
        }
        
        @Override
        public ScenePlayerInfoNotify getDefaultInstanceForType() {
            return ScenePlayerInfoNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new ScenePlayerInfoNotify();
            PARSER = new AbstractParser<ScenePlayerInfoNotify>() {
                @Override
                public ScenePlayerInfoNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new ScenePlayerInfoNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ScenePlayerInfoNotifyOrBuilder
        {
            private int bitField0_;
            private List<ScenePlayerInfoOuterClass.ScenePlayerInfo> playerInfoList_;
            private RepeatedFieldBuilderV3<ScenePlayerInfoOuterClass.ScenePlayerInfo, ScenePlayerInfoOuterClass.ScenePlayerInfo.Builder, ScenePlayerInfoOuterClass.ScenePlayerInfoOrBuilder> playerInfoListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return ScenePlayerInfoNotifyOuterClass.internal_static_ScenePlayerInfoNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return ScenePlayerInfoNotifyOuterClass.internal_static_ScenePlayerInfoNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(ScenePlayerInfoNotify.class, Builder.class);
            }
            
            private Builder() {
                this.playerInfoList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.playerInfoList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (ScenePlayerInfoNotify.alwaysUseFieldBuilders) {
                    this.getPlayerInfoListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.playerInfoListBuilder_ == null) {
                    this.playerInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.playerInfoListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return ScenePlayerInfoNotifyOuterClass.internal_static_ScenePlayerInfoNotify_descriptor;
            }
            
            @Override
            public ScenePlayerInfoNotify getDefaultInstanceForType() {
                return ScenePlayerInfoNotify.getDefaultInstance();
            }
            
            @Override
            public ScenePlayerInfoNotify build() {
                final ScenePlayerInfoNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public ScenePlayerInfoNotify buildPartial() {
                final ScenePlayerInfoNotify result = new ScenePlayerInfoNotify(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.playerInfoListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.playerInfoList_ = Collections.unmodifiableList((List<? extends ScenePlayerInfoOuterClass.ScenePlayerInfo>)this.playerInfoList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.playerInfoList_ = this.playerInfoList_;
                }
                else {
                    result.playerInfoList_ = this.playerInfoListBuilder_.build();
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
                if (other instanceof ScenePlayerInfoNotify) {
                    return this.mergeFrom((ScenePlayerInfoNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final ScenePlayerInfoNotify other) {
                if (other == ScenePlayerInfoNotify.getDefaultInstance()) {
                    return this;
                }
                if (this.playerInfoListBuilder_ == null) {
                    if (!other.playerInfoList_.isEmpty()) {
                        if (this.playerInfoList_.isEmpty()) {
                            this.playerInfoList_ = other.playerInfoList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensurePlayerInfoListIsMutable();
                            this.playerInfoList_.addAll(other.playerInfoList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.playerInfoList_.isEmpty()) {
                    if (this.playerInfoListBuilder_.isEmpty()) {
                        this.playerInfoListBuilder_.dispose();
                        this.playerInfoListBuilder_ = null;
                        this.playerInfoList_ = other.playerInfoList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.playerInfoListBuilder_ = (ScenePlayerInfoNotify.alwaysUseFieldBuilders ? this.getPlayerInfoListFieldBuilder() : null);
                    }
                    else {
                        this.playerInfoListBuilder_.addAllMessages(other.playerInfoList_);
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
                ScenePlayerInfoNotify parsedMessage = null;
                try {
                    parsedMessage = ScenePlayerInfoNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (ScenePlayerInfoNotify)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensurePlayerInfoListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.playerInfoList_ = new ArrayList<ScenePlayerInfoOuterClass.ScenePlayerInfo>(this.playerInfoList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<ScenePlayerInfoOuterClass.ScenePlayerInfo> getPlayerInfoListList() {
                if (this.playerInfoListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends ScenePlayerInfoOuterClass.ScenePlayerInfo>)this.playerInfoList_);
                }
                return this.playerInfoListBuilder_.getMessageList();
            }
            
            @Override
            public int getPlayerInfoListCount() {
                if (this.playerInfoListBuilder_ == null) {
                    return this.playerInfoList_.size();
                }
                return this.playerInfoListBuilder_.getCount();
            }
            
            @Override
            public ScenePlayerInfoOuterClass.ScenePlayerInfo getPlayerInfoList(final int index) {
                if (this.playerInfoListBuilder_ == null) {
                    return this.playerInfoList_.get(index);
                }
                return this.playerInfoListBuilder_.getMessage(index);
            }
            
            public Builder setPlayerInfoList(final int index, final ScenePlayerInfoOuterClass.ScenePlayerInfo value) {
                if (this.playerInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensurePlayerInfoListIsMutable();
                    this.playerInfoList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.playerInfoListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setPlayerInfoList(final int index, final ScenePlayerInfoOuterClass.ScenePlayerInfo.Builder builderForValue) {
                if (this.playerInfoListBuilder_ == null) {
                    this.ensurePlayerInfoListIsMutable();
                    this.playerInfoList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.playerInfoListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addPlayerInfoList(final ScenePlayerInfoOuterClass.ScenePlayerInfo value) {
                if (this.playerInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensurePlayerInfoListIsMutable();
                    this.playerInfoList_.add(value);
                    this.onChanged();
                }
                else {
                    this.playerInfoListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addPlayerInfoList(final int index, final ScenePlayerInfoOuterClass.ScenePlayerInfo value) {
                if (this.playerInfoListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensurePlayerInfoListIsMutable();
                    this.playerInfoList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.playerInfoListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addPlayerInfoList(final ScenePlayerInfoOuterClass.ScenePlayerInfo.Builder builderForValue) {
                if (this.playerInfoListBuilder_ == null) {
                    this.ensurePlayerInfoListIsMutable();
                    this.playerInfoList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.playerInfoListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addPlayerInfoList(final int index, final ScenePlayerInfoOuterClass.ScenePlayerInfo.Builder builderForValue) {
                if (this.playerInfoListBuilder_ == null) {
                    this.ensurePlayerInfoListIsMutable();
                    this.playerInfoList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.playerInfoListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllPlayerInfoList(final Iterable<? extends ScenePlayerInfoOuterClass.ScenePlayerInfo> values) {
                if (this.playerInfoListBuilder_ == null) {
                    this.ensurePlayerInfoListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.playerInfoList_);
                    this.onChanged();
                }
                else {
                    this.playerInfoListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearPlayerInfoList() {
                if (this.playerInfoListBuilder_ == null) {
                    this.playerInfoList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.playerInfoListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removePlayerInfoList(final int index) {
                if (this.playerInfoListBuilder_ == null) {
                    this.ensurePlayerInfoListIsMutable();
                    this.playerInfoList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.playerInfoListBuilder_.remove(index);
                }
                return this;
            }
            
            public ScenePlayerInfoOuterClass.ScenePlayerInfo.Builder getPlayerInfoListBuilder(final int index) {
                return this.getPlayerInfoListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public ScenePlayerInfoOuterClass.ScenePlayerInfoOrBuilder getPlayerInfoListOrBuilder(final int index) {
                if (this.playerInfoListBuilder_ == null) {
                    return this.playerInfoList_.get(index);
                }
                return this.playerInfoListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends ScenePlayerInfoOuterClass.ScenePlayerInfoOrBuilder> getPlayerInfoListOrBuilderList() {
                if (this.playerInfoListBuilder_ != null) {
                    return this.playerInfoListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends ScenePlayerInfoOuterClass.ScenePlayerInfoOrBuilder>)this.playerInfoList_);
            }
            
            public ScenePlayerInfoOuterClass.ScenePlayerInfo.Builder addPlayerInfoListBuilder() {
                return this.getPlayerInfoListFieldBuilder().addBuilder(ScenePlayerInfoOuterClass.ScenePlayerInfo.getDefaultInstance());
            }
            
            public ScenePlayerInfoOuterClass.ScenePlayerInfo.Builder addPlayerInfoListBuilder(final int index) {
                return this.getPlayerInfoListFieldBuilder().addBuilder(index, ScenePlayerInfoOuterClass.ScenePlayerInfo.getDefaultInstance());
            }
            
            public List<ScenePlayerInfoOuterClass.ScenePlayerInfo.Builder> getPlayerInfoListBuilderList() {
                return this.getPlayerInfoListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<ScenePlayerInfoOuterClass.ScenePlayerInfo, ScenePlayerInfoOuterClass.ScenePlayerInfo.Builder, ScenePlayerInfoOuterClass.ScenePlayerInfoOrBuilder> getPlayerInfoListFieldBuilder() {
                if (this.playerInfoListBuilder_ == null) {
                    this.playerInfoListBuilder_ = new RepeatedFieldBuilderV3<ScenePlayerInfoOuterClass.ScenePlayerInfo, ScenePlayerInfoOuterClass.ScenePlayerInfo.Builder, ScenePlayerInfoOuterClass.ScenePlayerInfoOrBuilder>(this.playerInfoList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.playerInfoList_ = null;
                }
                return this.playerInfoListBuilder_;
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
    
    public interface ScenePlayerInfoNotifyOrBuilder extends MessageOrBuilder
    {
        List<ScenePlayerInfoOuterClass.ScenePlayerInfo> getPlayerInfoListList();
        
        ScenePlayerInfoOuterClass.ScenePlayerInfo getPlayerInfoList(final int p0);
        
        int getPlayerInfoListCount();
        
        List<? extends ScenePlayerInfoOuterClass.ScenePlayerInfoOrBuilder> getPlayerInfoListOrBuilderList();
        
        ScenePlayerInfoOuterClass.ScenePlayerInfoOrBuilder getPlayerInfoListOrBuilder(final int p0);
    }
}
